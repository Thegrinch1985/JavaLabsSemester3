/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  x00125128
 * Created: 03-Nov-2016
 */

Drop TABLE FullTimeEmployee;
CREATE TABLE FullTimeEmployee (
        ID NUMBER PRIMARY KEY,
        salary decimal(8,2),
        FOREIGN KEY (ID) REFERENCES EMPLOYEEJ (ID) 
 
);


INSERT INTO FullTimeEmployee VALUES (1,5000);
INSERT INTO FullTimeEmployee VALUES (3,4000);
INSERT INTO FullTimeEmployee VALUES (5,6500);
