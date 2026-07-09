-- Last updated: 7/9/2026, 3:10:43 PM
SELECT 
    score,
    DENSE_RANK() OVER (ORDER BY score DESC) AS 'rank'
FROM Scores;