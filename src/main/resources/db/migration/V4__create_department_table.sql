-- V4__create_department_table.sql
-- Flyway Database Migration script to create department table

CREATE TABLE department (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    code VARCHAR(20) UNIQUE NOT NULL
);
