prompt PL/SQL Developer import file
prompt Created on 2014年11月10日星期一 by Administrator
set feedback off
set define off
prompt Creating ADMIN...
create table ADMIN
(
  ID       NUMBER(8) not null,
  USERNAME VARCHAR2(20),
  PASSWORD VARCHAR2(20)
)
;
alter table ADMIN
  add primary key (ID);

prompt Creating GUESTBOOK...
create table GUESTBOOK
(
  ID      NUMBER not null,
  NAME    VARCHAR2(20) not null,
  PHONE   VARCHAR2(20),
  EMAIL   VARCHAR2(40),
  TITLE   VARCHAR2(80) not null,
  CONTENT VARCHAR2(2000),
  TIME    VARCHAR2(20) not null
)
;

prompt Loading ADMIN...
insert into ADMIN (ID, USERNAME, PASSWORD)
values (10000, 'liuwei', 'zhongguo');
insert into ADMIN (ID, USERNAME, PASSWORD)
values (10001, 'admin', '123');
insert into ADMIN (ID, USERNAME, PASSWORD)
values (42, 'dfadsf', 'adsfasdf');
insert into ADMIN (ID, USERNAME, PASSWORD)
values (22, 'tom', '123');
insert into ADMIN (ID, USERNAME, PASSWORD)
values (41, null, null);
commit;
prompt 5 records loaded
prompt Loading GUESTBOOK...
insert into GUESTBOOK (ID, NAME, PHONE, EMAIL, TITLE, CONTENT, TIME)
values (49, 'zjjlive', '1212121212', 'zjjlive@163.com', 'testtest', null, '2014-11-10:10:11:56');
insert into GUESTBOOK (ID, NAME, PHONE, EMAIL, TITLE, CONTENT, TIME)
values (50, 'tom', '33333333333333', 'tom@163.com', 'tom', 'tom', '2014-11-10:10:14:22');
commit;
prompt 2 records loaded
set feedback on
set define on
prompt Done.
