package com.example.customerservice.controller;

import com.example.customerservice.entity.CustomerConfigEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Kin
 */
@RestController
public class CustomerController {
    @Autowired
    private CustomerConfigEntity customerConfigEntity;

    @RequestMapping("/show")
    public String show(){
        System.out.println("Show time~");
        System.out.println(customerConfigEntity.toString());
        return customerConfigEntity.toString();
    }
}
