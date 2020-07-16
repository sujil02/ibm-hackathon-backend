package com.example.ibmhackathonbackend.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;
public class Post {
    private int id;
    private String title;
    private String description;
    @ManyToOne
    @JsonIgnore
    private PlatformUser user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PlatformUser getUser() {
        return user;
    }

    public void setUser(PlatformUser user) {
        this.user = user;
    }

    public Post(int id, String title, String description, PlatformUser user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.user = user;
    }


    
}