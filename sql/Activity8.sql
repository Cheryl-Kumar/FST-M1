REM   Script: Activity8
REM   Activity8

select * from orders;

select max(purchase_amount) from orders group by customer_id;

select salesman_id, order_date, max(purchase_amount) as "maximum purchase order" from orders group by salesman_id, order_date having order_date = '17-AUG-12';

select customer_id, order_date, max(purchase_amount) as "maximum purchase order" from orders group by customer_id, order_date having max(purchase_amount) in (2030, 3450, 5760, 6000);

