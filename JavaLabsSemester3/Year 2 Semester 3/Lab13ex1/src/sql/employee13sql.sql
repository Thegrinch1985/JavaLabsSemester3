/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  x00125128
 * Created: 02-Nov-2016
 */

Drop TABLE Employee13;
CREATE TABLE Employee13 (id NUMBER PRIMARY KEY, 	
        type VARCHAR2(5),
        name VARCHAR2(40), 
	startDate VARCHAR2(20), 
	salary DECIMAL(8,2),
        rate DECIMAL(5,2),
        hours DECIMAL(5,2)
);

INSERT INTO Employee13 VALUES (1,'FT','Peter', '23/JAN/2015',50000.00,NULL,NULL);
INSERT INTO Employee13 VALUES (2,'PT','John', '13/FEB/2015',NULL,45.00,70);
INSERT INTO Employee13 VALUES (3,'FT','Mary', '16/MAR/2014',40000.00,NULL,NULL);
INSERT INTO Employee13 VALUES (4,'PT','Pat', '29/APR/2014',NULL,30.50,40);
INSERT INTO Employee13 VALUES (5,'FT','Karen', '06/MAY/2014',65000.00,NULL,NULL);

