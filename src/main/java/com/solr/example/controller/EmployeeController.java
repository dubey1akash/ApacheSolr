package com.solr.example.controller;

import com.solr.example.model.Employee;
import com.solr.example.repository.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
   @Autowired
    private EmployeeRepository employeeRepository;
//this annotation used when application will be up
   @PostConstruct
   public void addEmployee(){
       List<Employee> list = new ArrayList<>();
       list.add(new Employee(121,"tuhai", new String[]{"tu h", "jane kay", "log kahenge"}));
       list.add(new Employee(23,"jne",new String[]{"teri", "aisi ", "taisi"}));
       //employeeRepository.savaAll(list);
   }
}
