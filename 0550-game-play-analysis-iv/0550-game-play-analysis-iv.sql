# Write your MySQL query statement below
with ranked as (
    select player_id , min(event_date) as first_login from Activity group by player_id
)
select Round(count(a.player_id)/(select count(distinct player_id)from activity),2) as fraction
from ranked as r
join activity as a
on a.player_id=r.player_id
where a.event_date = date_add(r.first_login , Interval 1 day);