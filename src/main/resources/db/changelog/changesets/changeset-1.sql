--liquibase formatted sql

-- changeset escott:1
CREATE TABLE test_table (
    test_id INT PRIMARY KEY,
    test_column INT
);

-- changeset escott:2
CREATE TABLE users (
    id CHAR(36) NOT NULL PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    created_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE questions (
    id CHAR(36) NOT NULL PRIMARY KEY,
    question VARCHAR(1000) NOT NULL,
    created_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_by CHAR(36) NOT NULL,
    CONSTRAINT fk_questions_created_by FOREIGN KEY (created_by) REFERENCES users(id)
);