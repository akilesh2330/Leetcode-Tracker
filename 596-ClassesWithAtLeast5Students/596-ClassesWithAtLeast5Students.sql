-- Last updated: 7/9/2026, 3:09:29 PM
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(DISTINCT student) >= 5;