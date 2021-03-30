package org.academiadecodigo.javabank.controller;

import org.academiadecodigo.javabank.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
3

@Controller
public class CustomerController{

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {

        this.customerService = customerService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String getCustomerList(Model model) {

        model.addAttribute("customerList", customerService.getlistCustomers());

        return "index";
    }
}
