
create database mts;
use mts;

create table mts.ACCOUNTS(
num varchar(14) primary key,
balance double,
accHolderName varchar(30),
type varchar(10),
status varchar(10)
);

insert into mts.ACCOUNTS values ("1",1000.00,"Nag","SAVING","ACTIVE");
insert into mts.ACCOUNTS values ("2",1000.00,"Ria","SAVING","ACTIVE");


create table mts.TxnHistory(
id int primary key auto_increment,
type varchar(30),
amount double,
closingBalance double, 
remark varchar(10),
date date,
num varchar(14) references mts.ACCOUNTS(num)
);


