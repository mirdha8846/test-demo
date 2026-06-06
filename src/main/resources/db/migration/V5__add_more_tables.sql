-- V5__add_more_tables.sql
-- Flyway Database Migration script to add more tables (company, employee_project, leave_request)

CREATE TABLE company (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    registration_number VARCHAR(50) UNIQUE NOT NULL,
    address VARCHAR(255),
    website VARCHAR(255)
);

CREATE TABLE employee_project (
    employee_id BIGINT NOT NULL,
    project_id BIGINT NOT NULL,
    PRIMARY KEY (employee_id, project_id),
    CONSTRAINT fk_employee FOREIGN KEY (employee_id) REFERENCES employee(id) ON DELETE CASCADE,
    CONSTRAINT fk_project FOREIGN KEY (project_id) REFERENCES project(id) ON DELETE CASCADE
);

CREATE TABLE leave_request (
    id BIGSERIAL PRIMARY KEY,
    employee_id BIGINT NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    type VARCHAR(50) NOT NULL,
    status VARCHAR(50) NOT NULL,
    CONSTRAINT fk_employee_leave FOREIGN KEY (employee_id) REFERENCES employee(id) ON DELETE CASCADE
);
