package com.yurima.organizations.entity;

/**
 * Created by Yury on 16.11.2017.
 */

public class Organization {

    String photo;
    String address;
    String phone;
    String manager;
    String description;

    public Organization(String photo, String address, String phone, String manager, String description) {
        this.photo = photo;
        this.address = address;
        this.phone = phone;
        this.manager = manager;
        this.description = description;
    }
}
