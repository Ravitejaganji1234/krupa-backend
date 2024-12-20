package com.accesshr.emsbackend.response;

import lombok.Data;

@Data
public class LoginResponse {

    private String message;
    private Boolean status;
    private String role; // Add this field
    private String tokenData;

    public LoginResponse(String message, Boolean status, String role) {
        this.message = message;
        this.status = status;
        this.role = role; // Initialize the role
    }

    public LoginResponse() {
    }

    public LoginResponse(String message, boolean status, String role, String tokenData) {
        this.message=message;
        this.role=role;
        this.status=status;
        this.tokenData=tokenData;
    }

//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public Boolean getStatus() {
//        return status;
//    }
//
//    public void setStatus(Boolean status) {
//        this.status = status;
//    }
//
//    public String getRole() { // Add getter for the role
//        return role;
//    }
//
//    public void setRole(String role) { // Add setter for the role
//        this.role = role;
//    }
//
//    @Override
//    public String toString() {
//        return "LoginResponse{" +
//                "message='" + message + '\'' +
//                ", status='" + status + '\'' +
//                ", role='" + role + '\'' + // Include role in toString
//                '}';
//    }
}
