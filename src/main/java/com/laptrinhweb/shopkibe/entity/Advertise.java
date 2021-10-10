package com.laptrinhweb.shopkibe.entity;

import javax.persistence.*;

@Entity
@Table(name = "advertise3")
public class Advertise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String img ;
    private String name ;
    private String description;

    public Advertise(){}

    public Advertise(String img , String name,String description ) {
        this.img = img ;
        this.name = name ;
        this.description = description;

    }
    public Advertise(Long id ,String img , String name ,String description) {
        this.id = id;
        this.img = img ;
        this.name = name ;
        this.description = description;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
