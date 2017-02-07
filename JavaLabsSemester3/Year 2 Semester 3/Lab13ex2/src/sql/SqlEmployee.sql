/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  x00125128
 * Created: 03-Nov-2016
 */
Drop TABLE PartTimeEmployee;
Drop TABLE FullTimeEmployee;
Drop Table Employee;


CREATE TABLE Employee(

id NUMBER NOT NULL,
type VARCHAR2(20),
name VARCHAR2(40),
startDate VARCHAR2(20),

PRIMARY KEY(id)


);

CREATE TABLE FullTimeEmployee (
        id NUMBER NOT NULL ,
        salary decimal(8,2),
        PRIMARY KEY(id),
        FOREIGN KEY (id) REFERENCES Employee(id) 
 
);


CREATE TABLE PartTimeEmployee(
        id NUMBER NOT NULL,
        rate decimal(5,2),
        hours decimal(5,2), 
        PRIMARY KEY(id),
        FOREIGN KEY (id) REFERENCES Employee(id)  
);

INSERT INTO Employee VALUES (1,'FT','Peter','23/Jan/2015');
INSERT INTO Employee VALUES (2,'PT','John','13/Feb/2015');
INSERT INTO Employee VALUES (3,'FT','Mary','16/Mar/2014');
INSERT INTO Employee VALUES (4,'PT','Pat','29/Apr/2014');
INSERT INTO Employee VALUES (5,'FT','Karen','06/May/2014');


INSERT INTO PartTimeEmployee VALUES (2,45,70);
INSERT INTO PartTimeEmployee VALUES (4,30.5,40);

INSERT INTO FullTimeEmployee VALUES (1,5000);
INSERT INTO FullTimeEmployee VALUES (3,4000);
INSERT INTO FullTimeEmployee VALUES (5,6500);
