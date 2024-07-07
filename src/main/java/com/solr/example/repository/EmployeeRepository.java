package com.solr.example.repository;

import com.solr.example.model.Employee;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.data.solr.repository.SolrRepository;


public interface EmployeeRepository extends SolrRepository<Employee,Integer> {
    //the first one the argument type of entity you want to perform operation
    //type of the primary key

}
