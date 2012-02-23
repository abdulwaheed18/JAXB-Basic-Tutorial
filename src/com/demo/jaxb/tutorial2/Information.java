package com.demo.jaxb.tutorial2;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Information {
    
    private String city;
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public long getMobile() {
        return mobile;
    }
    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
    private long mobile;

}
