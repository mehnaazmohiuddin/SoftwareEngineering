create table if not exists Charity
(
  id INTEGER AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  orgnaization VARCHAR(255) ,
  amount INTEGER,
  currency VARCHAR(3),
  date INTEGER,
  city VARCHAR(45),
  primary key (id)
);

alter table Charity
alter column date date;
insert into Charity( name, orgnaization, amount, currency, date, city) values ('mehnaaz','faiz-e-aam', 2000,'inr', '2017-07-14','hyderabad');

select * from Charity;