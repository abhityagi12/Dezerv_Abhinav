package com.fluxkart.fluxkartbackend.model;

public class IdentifyRequest {
    private String email;
    private String phoneNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public IdentifyRequest(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    
}
