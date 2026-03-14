# Write your MySQL query statement below
Select p.firstName,p.lastName,A.city,A.state
From Person as p
 Left Join Address as A
on p.personId = A.personId;