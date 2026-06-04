package com.example.crudapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "leave_request")
public class LeaveRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "start_date", nullable = false)
    private java.time.LocalDate startDate;

    @Column(name = "end_date", nullable = false)
    private java.time.LocalDate endDate;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "status", nullable = false)
    private String status;

    // Default Constructor
    public LeaveRequest() {
    }

    // Parameterized Constructor
    public LeaveRequest(Employee employee, java.time.LocalDate startDate, java.time.LocalDate endDate, String type, String status) {
        this.employee = employee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public java.time.LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(java.time.LocalDate startDate) {
        this.startDate = startDate;
    }

    public java.time.LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(java.time.LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LeaveRequest{" +
                "id=" + id +
                ", employee=" + (employee != null ? employee.getId() : null) +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
