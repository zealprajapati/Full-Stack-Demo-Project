package com.zeel.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
    //token: "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ6ZWVsIiwiZXhwIjoxNTg4NzA2ODYzLCJpYXQiOjE1ODgxMDIwNjN9.I8JoFHd4_jSH26PioC4SKRCnSplOmHxDDJl4UdBKJr_v6FAEwi5gJgIAv0q9lns47oWKwkBCNOdMZS74G4lUVg"
    
    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

