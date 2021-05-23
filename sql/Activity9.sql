REM   Script: Activity9
REM   Joins

select * from customers;

select * from orders;

select * from salesman;

SELECT customers.customer_name AS "Customer Name", customers.city, salesman.salesman_name AS "Salesman", salesman.commission FROM customers INNER JOIN salesman ON customers.salesman_id = salesman.salesman_id;

SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman", b.salesman_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

