CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  SET N := N - 1;              -- precompute offset
  RETURN (
    SELECT DISTINCT salary
    FROM Employee
    ORDER BY salary DESC
    LIMIT 1 OFFSET N           -- use the variable, not (N - 1)
  );
END
