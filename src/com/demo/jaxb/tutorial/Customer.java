package com.demo.jaxb.tutorial;

import javax.xml.bind.annotation.XmlRootElement;

import com.demo.jaxb.tutorial2.Information;
 
@XmlRootElement
public class Customer {
 
    private long id;
    private String name;

    Information information ;
    
    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
}