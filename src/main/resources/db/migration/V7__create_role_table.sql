-- V7__create_role_table.sql
-- Flyway Database Migration script to create role table

CREATE TABLE role (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(50) UNIQUE NOT NULL,
    description VARCHAR(255)
);
