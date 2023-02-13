package com.example.usersgse.models;
/**
 * Project: UsersGSE
 * From: com.example.usersgse.views
 * @author Ivan Barbosa on 11/02/2023 at 11:05 a. m.
 * Linkedin: https://www.linkedin.com/in/ivanbarbosaortega/
 * Esta clase define objetos de tipo Users
 */

public class Users {
    private int id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;

    /**
     * Constructor para crear un usuario
     *
     * @param id       identificador del usuario
     * @param name     Nombre del usuario, usado para filtrar la lista de usuarios
     * @param username
     * @param email
     * @param phone
     * @param website
     */
    public Users(int id, String name, String username, String email, String phone, String website) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.website = website;
    }// Cierre del contructor


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

}
