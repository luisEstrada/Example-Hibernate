--Database
CREATE DATABASE IF NOT EXISTS hibernateexample;


--TABLE STUDENT
CREATE TABLE IF NOT EXISTS STUDENT(
    student_id INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
    student_name VARCHAR(20) NOT NULL,
    student_age VARCHAR(20) NOT NULL,
    PRIMARY KEY(student_id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;