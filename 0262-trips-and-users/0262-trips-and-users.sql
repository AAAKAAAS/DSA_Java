# Write your MySQL query statement below
SELECT request_at as Day ,
Round(
    AVG(
        case when status !='completed'then 1 else 0 end
    ),2
) as 'Cancellation Rate'
from Trips as t
join Users as u
on t.client_id=u.users_id
join Users as d
on t.driver_id = d.users_id
where u.banned ='No' and d.banned ='No' and t.request_at between '2013-10-01' and '2013-10-03' 
group by request_at
order by request_at;