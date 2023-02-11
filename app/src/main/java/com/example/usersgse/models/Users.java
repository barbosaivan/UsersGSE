package com.example.usersgse.models;/*
 * Project: UsersGSE
 * From: com.example.usersgse.views
 * Create by Ivan Barbosa on 11/02/2023 at 11:05 a. m.
 * Linkedin: https://www.linkedin.com/in/ivanbarbosaortega/
 */

public class Users {
    private int id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;

    public Users(int id, String name, String username, String email, String phone, String website) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.website = website;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
