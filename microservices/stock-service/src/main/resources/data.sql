DROP TABLE IF EXISTS STOCK;

CREATE TABLE STOCK (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  catalogshortid VARCHAR(10) NOT NULL,
  qty INT
);

INSERT INTO STOCK
    (catalogshortid, qty) VALUES
    ('Desk001' , 20),
    ('Desk002' , 30),
    ('Desk003' , 100),
    ('Chair001', 200),
    ('Chair002', 50),
    ('Chair003', 700),
    ('Sofa001' , 20),
    ('Sofa002' , 40);