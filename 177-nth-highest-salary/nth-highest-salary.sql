CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  SET N=N-1;
  RETURN (
      # Write your MySQL query statement below.
      SELECT distinct salary as "getNthHighestSalary"
      from Employee 
      Order by salary desc
      limit N,1

  );
END