DBScripts:
==========
create database eventsdb;

use eventsdb;

create table employee_events(EMPLOYEE_EVENT_ID int primary key auto_increment, EMPLOYEE_ID varchar(20) NOT NULL,EVENT_NAME varchar(20) NOT NULL,CREATION_TIME datetime NOT NULL);

BUILD and RUN
=============
1.Touch the pom.xml and it will build automatically.
2.run as Spring Boot App.

Swagger UI URLS
================
1.http://localhost:8082/swagger-ui.html
