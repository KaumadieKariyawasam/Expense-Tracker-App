package com.example.vizu.abc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor

@Data
@Entity(name = "post")
public class Post {

    @Id
    private Long id;
    private String title;
    private String content;
    private Date dateCreated;
    
}
/*
spring.datasource.url=jdbc:mysql://localhost:3306/abc
spring.datasource.username=root
spring.datasource.password=1997
spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect

spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true

 */
