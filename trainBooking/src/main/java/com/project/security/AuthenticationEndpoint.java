package com.project.security;

import com.project.user.*;
import jakarta.xml.bind.JAXBElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.namespace.QName;

@Endpoint
public class AuthenticationEndpoint {
    private static final String NAMESPACE_URI = "http://project.com/user";

    @Autowired
    private AuthenticationService authService = new AuthenticationService();


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUserRequest")
    @ResponsePayload
    public JAXBElement<GetUserResponse> login(@RequestPayload JAXBElement<GetUserRequest> request) {
        String username = request.getValue().getUsername();
        String password = request.getValue().getPassword();
        String token = authService.authenticate(username, password);
        GetUserResponse response = new ObjectFactory().createGetUserResponse();
        if (token !=null){
        response.setToken(token);}
        else {
            response.setError("Invalid username or password");
        }
        return createGetResponseJaxbElement(response, GetUserResponse.class);

    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addUserRequest")
    @ResponsePayload
    public JAXBElement<AddUserResponse> signUp(@RequestPayload JAXBElement<AddUserRequest> request) {
        String username = request.getValue().getUsername();
        String password = request.getValue().getPassword();
        String firstname = request.getValue().getFirstname();
        String lastname = request.getValue().getLastname();
        String email = request.getValue().getEmail();
        boolean userCreated = authService.signup(username,password,firstname,lastname,email);

        AddUserResponse response = new ObjectFactory().createAddUserResponse();
        if (userCreated){
            response.setSuccess(true);}
        else {
            response.setSuccess(false);
            response.setError("Username already exists");
        }
        return createAddResponseJaxbElement(response, AddUserResponse.class);
    }

    private JAXBElement createGetResponseJaxbElement(GetUserResponse object, Class clazz) {

        return new JAXBElement<>(new QName(NAMESPACE_URI, clazz.getSimpleName()), clazz, object);

    }
    private JAXBElement createAddResponseJaxbElement(AddUserResponse object, Class clazz) {

        return new JAXBElement<>(new QName(NAMESPACE_URI, clazz.getSimpleName()), clazz, object);

    }
}
