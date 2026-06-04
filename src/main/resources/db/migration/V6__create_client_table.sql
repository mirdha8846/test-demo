-- V6__create_client_table.sql
-- Flyway Database Migration script to create client table

CREATE TABLE client (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    company_id BIGINT,
    CONSTRAINT fk_client_company FOREIGN KEY (company_id) REFERENCES company(id) ON DELETE SET NULL
);
