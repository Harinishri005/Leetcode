# Write your MySQL query statement below
SELECT SCORE,
    DENSE_RANK() OVER (ORDER BY Score DESC) AS 'rank'
FROM SCORES
ORDER BY SCORE DESC;
