-- V3__create_project_table.sql
-- Flyway Database Migration script to create project table

CREATE TABLE project (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    budget DOUBLE PRECISION NOT NULL
);
