
package com.idepo.servicesservice.entity;

import javax.persistence.*;

@Table(name = "SERVICES")
@Entity
public class Services {
    @Id
    @GeneratedValue
    private int id;
    private String shortname;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}