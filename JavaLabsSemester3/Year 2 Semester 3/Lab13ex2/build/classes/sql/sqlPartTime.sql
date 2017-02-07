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
CREATE TABLE PartTimeEmployee(
        ID NUMBER PRIMARY KEY,
        rate decimal(5,2),
        hours decimal(5,2), 
        FOREIGN KEY (ID) REFERENCES EMPLOYEEJ (ID)  
);

INSERT INTO PartTimeEmployee VALUES (2,45,70);
INSERT INTO PartTimeEmployee VALUES (4,30.5,40);

