CREATE TYPE Author_T AS OBJECT
(BaoQuang_id VARCHAR2(3),
name VARCHAR2(10),
address VARCHAR2(20)) NOT FINAL
/
CREATE TABLE Author OF Author_T
(BaoQuang_id NOT NULL,
PRIMARY KEY (BaoQuang_id));

CREATE TYPE Industry_Based_T UNDER Author_T
(c_name VARCHAR2(10),
c_address VARCHAR2(20),
c_size VARCHAR2(10))
/
create table Industry_Base of Industry_Based_T;
CREATE TYPE Academic_T UNDER Author_T
(i_name VARCHAR2(10),
i_address VARCHAR2(20),
no_student NUMBER,
academic_type VARCHAR2(20)) NOT FINAL
/
create table Academic of Academic_T;
CREATE TYPE Research_Staff_T UNDER Academic_T
(topic VARCHAR2(20),
director VARCHAR2(10))
/
create table Research_Staff of Research_Staff_T;
CREATE TYPE Contacts AS VARRAY(3) OF NUMBER
/
CREATE TYPE Teaching_Staff_T UNDER Academic_T
(total_hour NUMBER,
contact_no Contacts,
member procedure totalsubject (contact_no in number)
)
/
create table Teaching_Staff of Teaching_Staff_T;
create type body Teaching Staff_T member procedure totalsubject
  (
    p_contact_no in number
  )
  as
  begin 
    select count (distinct code) 
    from Teaching_Staff_T
    where Subject_T.lecturer.code = Teaching_Staff_T.contact_no ;
  end totalsubject;
/
CREATE TYPE Subject_T AS OBJECT
(code VARCHAR2(10),
sub_name VARCHAR2(20),
venue VARCHAR2(10),
lecturer REF Teaching_Staff_T)
/


CREATE TYPE Chapter_T AS OBJECT
(c_no NUMBER,
c_title VARCHAR2(20),
page_no NUMBER)
/
CREATE TYPE Chapter_Table_T AS TABLE OF Chapter_T
/
CREATE TYPE Course_Manual_T AS OBJECT
(isbn VARCHAR2(10),
title VARCHAR2(20),
year NUMBER,
chapter Chapter_Table_T)
/
CREATE TABLE Course_Manual OF Course_Manual_T
(isbn NOT NULL,
PRIMARY KEY (isbn));

CREATE TABLE Publish
(author REF Author_T,
course_manual REF Course_Manual_T);
CREATE TABLE Subject OF Subject_T
(code NOT NULL,
PRIMARY KEY (code));
-------------------------
insert into Author(BaoQuang_id, name, address) values (Author_T('070078','TranBaoQuang','Vung Tau'));
insert into Author(BaoQuang_id, name, address) values (Author_T('070079','TranNgocMinh','Vung Tau'));





