package com.example.crudapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "audit_log")
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "table_name", nullable = false)
    private String tableName;

    @Column(name = "action", nullable = false)
    private String action;

    @Column(name = "changed_by")
    private String changedBy;

    @Column(name = "changed_at")
    private java.time.LocalDateTime changedAt;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "severity")
    private String severity;

    // Default Constructor
    public AuditLog() {
    }

    // Parameterized Constructor
    public AuditLog(String tableName, String action, String changedBy, java.time.LocalDateTime changedAt, String description) {
        this.tableName = tableName;
        this.action = action;
        this.changedBy = changedBy;
        this.changedAt = changedAt;
        this.description = description;
    }

    // Full Parameterized Constructor
    public AuditLog(String tableName, String action, String changedBy, java.time.LocalDateTime changedAt, String description, String severity) {
        this.tableName = tableName;
        this.action = action;
        this.changedBy = changedBy;
        this.changedAt = changedAt;
        this.description = description;
        this.severity = severity;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }

    public java.time.LocalDateTime getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(java.time.LocalDateTime changedAt) {
        this.changedAt = changedAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "AuditLog{" +
                "id=" + id +
                ", tableName='" + tableName + '\'' +
                ", action='" + action + '\'' +
                ", changedBy='" + changedBy + '\'' +
                ", changedAt=" + changedAt +
                ", description='" + description + '\'' +
                ", severity='" + severity + '\'' +
                '}';
    }
}
