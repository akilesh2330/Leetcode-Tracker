-- Last updated: 7/9/2026, 3:10:26 PM
DELETE p1
FROM Person p1
JOIN Person p2
ON p1.Email = p2.Email
AND p1.Id > p2.Id;