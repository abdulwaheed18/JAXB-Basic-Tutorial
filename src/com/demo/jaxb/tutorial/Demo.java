package com.demo.jaxb.tutorial;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.demo.jaxb.tutorial2.Information;

/**
 * 
 * @author abdul
 *
 */

public class Demo {

    public static void main(String[] args) throws Exception {
        
        // Get a JAXB Context for the object we created above
        JAXBContext jc = JAXBContext.newInstance(Customer.class);

        File demoFile = new File("demo.xml");

        Information information = new Information();
        information.setCity("PUNE");
        information.setMobile(97304492);
        Customer customer = new Customer();
        customer.setId(632);
        customer.setName("Samsung");
        customer.setInformation(information);

        // To convert Customer to XML, We need a JAXB Marshaller
        Marshaller m = jc.createMarshaller();
        
        // Make the output pretty
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
        // marshall the object to XML
        m.marshal(customer, demoFile);
    }
}