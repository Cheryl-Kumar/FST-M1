REM   Script: Activity7
REM   Activity7

select * from orders;

select sum(purchase_amount) as "Sum of all purchase amounts" from orders;

select avg(purchase_amount) as "average of all purchase amounts" from orders;

select max(purchase_amount) as "Maximum of all purchase amounts" from orders;

select min(purchase_amount) as "Minimum of all purchase amounts" from orders;

select count(distinct salesman_id) count from orders;

