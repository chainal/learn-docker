CREATE DATABASE kotoba;
CREATE USER 'springuser'@'%' IDENTIFIED BY 'ThePassword';
GRANT ALL ON kotoba.* TO 'springuser'@'%';

USE kotoba;
CREATE TABLE tango (
    tango_id BIGINT NOT NULL AUTO_INCREMENT,
    tango_kana VARCHAR(255),
    PRIMARY KEY (tango_id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4;
