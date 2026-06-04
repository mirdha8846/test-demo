-- V2__add_new_fields.sql
-- Flyway Database Migration script to add new fields

ALTER TABLE employee 
    ADD COLUMN phone_number VARCHAR(20),
    ADD COLUMN hire_date DATE,
    ADD COLUMN status VARCHAR(50);
