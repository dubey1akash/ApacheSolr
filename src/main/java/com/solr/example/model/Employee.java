package com.solr.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SolrDocument(collection = "employee")
//this one name is document as it is stored as nosql as key value pair json and not as entity object
//which would be case
//this is same done mongodb case
public class Employee {
    @Id
    @Field
    private int id;
    @Field
    private String name;
    @Field
    private String[] address;
}
