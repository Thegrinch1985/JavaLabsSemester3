/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  x00125128
 * Created: 04-Nov-2016
 */
drop table department;
drop table university;


create table university(
id NUMBER NOT NULL,
uName VARCHAR2(40),

PRIMARY KEY(id));

create table department(

depId NUMBER NOT NULL,
depName VARCHAR2(40),
id NUMBER NOT NULL,

PRIMARY KEY(depId),
FOREIGN KEY (id)REFERENCES university(id)


);
