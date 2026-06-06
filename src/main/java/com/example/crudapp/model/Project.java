package com.example.crudapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "budget", nullable = false)
    private Double budget;

    @Column(name = "description")
    private String description;

    // Default Constructor (required by JPA)
    public Project() {
    }

    // Parameterized Constructor
    public Project(String name, Double budget) {
        this.name = name;
        this.budget = budget;
    }

    // Full Parameterized Constructor
    public Project(String name, Double budget, String description) {
        this.name = name;
        this.budget = budget;
        this.description = description;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", budget=" + budget +
                ", description='" + description + '\'' +
                '}';
    }
}
