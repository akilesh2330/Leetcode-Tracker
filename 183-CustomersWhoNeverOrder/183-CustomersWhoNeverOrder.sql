-- Last updated: 7/9/2026, 3:10:35 PM
# Write your MySQL query statement below
select Customers.name as Customers
from Customers
left join Orders
ON Customers.id = Orders.customerId
WHERE Orders.customerId IS NULL;