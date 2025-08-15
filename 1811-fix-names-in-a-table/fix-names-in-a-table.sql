# Write your MySQL query statement below
SELECT 
    user_id,
    CONCAT(
        UPPER(LEFT(name, 1)),                            -- First character, uppercase
        LOWER(SUBSTRING(name, 2, CHAR_LENGTH(name)))     -- Rest of the string, lowercase
    ) AS name
FROM Users
order by user_id;
