create table if not exists charity
(
  id SERIAL PRIMARY KEY ,
  name VARCHAR(255) NOT NULL,
  orgnaization VARCHAR(255) ,
  amount INTEGER,
  currency VARCHAR(3),
  date date,
  city VARCHAR(45)
);

insert into charity( name, orgnaization, amount, currency, date, city) values ('mehnaaz','faiz-e-aam', 2000,'inr', '2017-07-14','hyderabad');

select * from charity;