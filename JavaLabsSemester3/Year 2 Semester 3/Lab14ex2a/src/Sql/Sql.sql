drop table DepUni;
drop table Department1;
drop Table University1;

create table University1(

uniId number not null,
uName VARCHAR2(40),

PRIMARY KEY(uniId)

); 

create table Department1(

depId number not null,
depName VARCHAR(40),

PRIMARY KEY (depId)
);

create table DepUni(

uniId number not null,
depid number not null,

primary key(uniId,depId),
foreign key (uniId) references University1(uniId),
foreign key (depId) references Department1(depId)


);



