select c.hacker_id, h.name, count(c.challenge_id) as total
from Hackers as h join Challenges as c on h.hacker_id = c.hacker_id
group by h.hacker_id, h.name
having total in
    (select cc.result from
        (select count(*) as result
        from Challenges
        group by hacker_id) as cc
    group by cc.result
    having count(cc.result) = 1)
or total =
    (select max(res.ponse) from
        (select count(hacker_id) as ponse
        from Challenges
        group by hacker_id
        order by hacker_id) as res)
order by total desc, c.hacker_id;