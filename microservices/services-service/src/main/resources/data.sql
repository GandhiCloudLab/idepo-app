DROP TABLE IF EXISTS SERVICES;

CREATE TABLE SERVICES (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  shortname VARCHAR(10) NOT NULL,
  description VARCHAR(50) NOT NULL
);

INSERT INTO SERVICES
    (shortname, description) VALUES
        ('001', 'Online planning appointments'),
        ('002', 'Delivery Information'),
        ('003', 'Assembly'),
        ('004', 'Finance'),
        ('005', 'Kitchen Services'),
        ('006', 'Removal & recycling'),
        ('007', 'Van rental'),
        ('008', 'TaskRabbit');