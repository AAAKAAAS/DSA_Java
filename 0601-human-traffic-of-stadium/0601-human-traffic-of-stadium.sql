# Write your MySQL query statement below
with grp as (
    select *,
    row_number() over (order by id) as rnk
    from Stadium where people>=100
),
ranked as (
    select *, id-rnk as grp_id
    from grp
)
select id ,visit_date,people from ranked
where grp_id in (
    select grp_id from ranked
    group by grp_id
    having count(*)>=3
)
order by visit_date