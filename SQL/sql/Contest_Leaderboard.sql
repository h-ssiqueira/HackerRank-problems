select s.hacker_id, h.name, sum(s.score)
from Hackers as h inner join (select hacker_id, max(score) as score from Submissions group by hacker_id, challenge_id) as s
on h.hacker_id = s.hacker_id
group by s.hacker_id, h.name
having sum(s.score) > 0
order by sum(s.score) desc, h.hacker_id;