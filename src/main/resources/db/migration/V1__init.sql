-- V1__init.sql
-- Flyway Database Migration script

CREATE TABLE employee (
    id BIGSERIAL PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    department VARCHAR(100) NOT NULL,
    salary DOUBLE PRECISION NOT NULL
);
