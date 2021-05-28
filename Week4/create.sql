CREATE TABLE Product( id int AUTO_INCREMENT PRIMARY KEY,
                     name varchar(44),
                     yearModel int,
                     brand varchar(44),
                     priceModel double,
                     color varchar(44));

CREATE TABLE Customer(id int AUTO_INCREMENT PRIMARY KEY,
                     name varchar(44),
                    address varchar(44),
                     phoneNumber varchar(44));

CREATE TABLE Seller(id int AUTO_INCREMENT PRIMARY KEY,
                    name varchar(44),
                     phoneNumber varchar(44));
CREATE TABLE Sale(id int AUTO_INCREMENT PRIMARY KEY,
                                       Customer_id int,
                                       Seller_id int,
                                       Product_id int,
                                       dateOfSale date);
ALTER TABLE sale ADD FOREIGN KEY (customer_id) REFERENCES customer(id);
ALTER TABLE sale ADD FOREIGN KEY (seller_id) REFERENCES seller(id);
ALTER TABLE sale ADD FOREIGN KEY (product_id) REFERENCES product(id);