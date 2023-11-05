package com.oauth.example.oauthexample;

public class RegistrationRequest {
    private String firstname;
    private String lastname;
    private String password;
    private String email;

    @Override
    public String toString() {
        return "RegistrationRequest{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumber='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // Getters and setters
    // You can use your IDE or Lombok to automatically generate them

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
