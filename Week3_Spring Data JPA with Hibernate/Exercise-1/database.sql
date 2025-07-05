CREATE DATABASE orm_learn;
USE orm_learn;

CREATE TABLE country (
    co_code VARCHAR(2) PRIMARY KEY,
    co_name VARCHAR(50)
);

INSERT INTO country VALUES ('IN', 'India'), ('US', 'United States');



SELECT * FROM country;
