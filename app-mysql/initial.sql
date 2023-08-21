CREATE DATABASE kotoba;
CREATE USER 'springuser'@'%' IDENTIFIED BY 'ThePassword';
GRANT ALL ON kotoba.* TO 'springuser'@'%';

USE kotoba;
CREATE TABLE t_tango (
    tango_id BIGINT NOT NULL AUTO_INCREMENT,
    word VARCHAR(255),
    kana VARCHAR(255),
    kana_tone INTEGER,
    type_info VARCHAR(255),
    meaning VARCHAR(255),
    unit_name VARCHAR(255),
    update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    
    PRIMARY KEY (tango_id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4;
