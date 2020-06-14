
package com.idepo.storelocatorservice.entity;

import javax.persistence.*;

@Table(name = "STORELOCATOR")
@Entity
public class StoreLocator {
    @Id
    @GeneratedValue
    private int id;
    private String state;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}