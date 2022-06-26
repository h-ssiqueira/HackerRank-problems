select h.* from Hackers as h
join Submissions as s on h.hacker_id = s.hacker_id
join Challenges as c on c.challenge_id = s.challenge_id
join Difficulty as d on d.difficulty_level = c.difficulty_level
where d.difficulty_level = c.difficulty_level and d.score = s.score
group by h.hacker_id, h.name
having count(s.hacker_id) > 1
order by count(s.hacker_id) desc, h.hacker_id;

-- full scores for more than 1 ch