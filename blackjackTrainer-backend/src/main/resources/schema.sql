CREATE TABLE IF NOT EXISTS clients (
                                       id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
                                       client_id VARCHAR(255) NOT NULL,
    username VARCHAR(50) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(255) NOT NULL,
    phone_number VARCHAR(25) NOT NULL
    );

-- CREATE TABLE IF NOT EXISTS employees (
--                                          id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
--                                          employee_id VARCHAR(255) NOT NULL,
--     first_name VARCHAR(50) NOT NULL,
--     last_name VARCHAR(50) NOT NULL
--
--     );