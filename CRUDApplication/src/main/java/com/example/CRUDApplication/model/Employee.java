package com.example.CRUDApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.hateoas.RepresentationModel;

//The table to store employee data. Employee i d is the primary key and is generated automatically.
@Entity
@Table(name = "Employees")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Employee extends RepresentationModel<Employee> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long departmentId;
}
