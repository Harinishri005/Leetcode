# Write your MySQL query statement below
select d.name as "Department",e.name as "Employee",e.salary as "Salary"
from Employee e
join Department d ON d.id=e.departmentId
where(e.departmentId,e.salary)IN(
    select  departmentId,MAX(salary)
    From Employee
    Group by departmentId
);