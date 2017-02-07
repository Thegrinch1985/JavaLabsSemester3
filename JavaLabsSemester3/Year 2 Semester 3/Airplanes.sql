drop table booking;
drop table ticket;
drop table passengers;
drop table planeroute;
drop table route;
drop table plane;

create table plane(
plane_id varchar2(255),
plane_operator varchar2(255),
capacity number,
Primary Key(plane_id)
);

create table route(
route_id varchar2(255),
route_name varchar2(255),
duration number,

Primary Key(route_id)
);

create table planeroute(
plane_id varchar2(255),
route_id varchar2(255),
Primary Key(plane_id, route_id),
Foreign Key(plane_id) references plane on delete set null,
Foreign Key(route_id) references route on delete set null
);

create table passengers(
pass_id varchar2(255),
pass_name varchar2(255),
pass_dob Date,
Primary Key(Pass_id)
);

create table ticket(
ticket_id varchar2(255),
ticket_type varchar2(255),
ticket_cost number,
route_id varchar2(255),
Primary Key(ticket_id),
Foreign Key(route_id) references route on delete set null
);

create table Booking(
pass_id varchar2(255),
ticket_id varchar2(255),
Primary Key(pass_id,ticket_id),
Foreign Key(pass_id) references passengers on delete set null,
Foreign Key(ticket_id) references ticket on delete set null
);


insert into plane values('Airbus001','Aer Lingus',220);
insert into plane values('Airbus002','Ryan Air',190);
insert into plane values('Airbus003','Aer Lingus',220);
insert into plane values('Airbus004','Ryan Air',190);

insert into route values('R1','Dublin-New York',420);
insert into route values('R2','Dublin-Paris',120);
insert into route values('R3','Dublin-Berlin',240);
insert into route values('R4','Dublin-Hong-Kong',780);


insert into planeroute values('Airbus001','R1');
insert into planeroute values('Airbus002','R2');
insert into planeroute values('Airbus003','R3');
insert into planeroute values('Airbus004','R4');


insert into passengers values('P1','Howie Lynch', '23-Apr-1985');
insert into passengers values('P2','Shane McCann', '23-May-1990');
insert into passengers values('P3','Ceiran McCabe', '03-Jan-1978');
insert into passengers values('P4','Phil ODonovan', '20-Dec-1948');
insert into passengers values('P5','Phil Ryan', '12-Nov-1982');
insert into passengers values('P6','Anthony Neville', '20-Apr-1984');
insert into passengers values('P7','Robbie Williams', '15-Oct-1989');
insert into passengers values('P8','Comic Book Guy', '30-Jun-1995');
insert into passengers values('P9','Homer Simpson', '5-Feb-1998');
insert into passengers values('P10','Father Ted', '10-Aug-1992');
insert into passengers values('P11','Wayne Rooney', '17-Sep-1996');
insert into passengers values('P12','Shrek', '19-Mar-1972');


insert into ticket values('TK123','Adult',12.00,'R1');
insert into ticket values('TK124','Child',6.00,'R3');
insert into ticket values('TK125','OAP',8.00,'R4');
insert into ticket values('TK126','Pass',0.00,'R4');
insert into ticket values('TK127','Adult',12.00,'R2');
insert into ticket values('TK128','OAP',8.00,'R4');
insert into ticket values('TK129','Child',6.00,'R3');
insert into ticket values('TK130','Adult',12.00,'R4');
insert into ticket values('TK131','Child',12.00,'R4');
insert into ticket values('TK132','Pass',0.00,'R3');
insert into ticket values('TK133','Child',6.00,'R4');
insert into ticket values('TK134','OAP',8.00,'R1');
insert into ticket values('TK135','Adult',12.00,'R1');
insert into ticket values('TK136','Adult',12.00,'R1');
insert into ticket values('TK137','Child',6.00,'R2');
insert into ticket values('TK138','Adult',12.00,'R1');
insert into ticket values('TK139','OAP',8.00,'R2');
insert into ticket values('TK140','Adult',12.00,'R2');
insert into ticket values('TK141','Child',6.00,'R2');
insert into ticket values('TK142','Pass',0.00,'R1');


insert into booking values('P1','TK123');
insert into booking values('P2','TK124');
insert into booking values('P3','TK125');
insert into booking values('P4','TK126');
insert into booking values('P5','TK127');
insert into booking values('P6','TK128');
insert into booking values('P7','TK129');
insert into booking values('P8','TK130');
insert into booking values('P9','TK131');
insert into booking values('P10','TK132');
insert into booking values('P11','TK133');
insert into booking values('P12','TK134');

