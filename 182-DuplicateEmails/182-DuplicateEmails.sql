-- Last updated: 7/9/2026, 3:10:36 PM
# Write your MySQL query statement below
Select Email
From Person
Group By Email
Having COUNT(Email)>1;

