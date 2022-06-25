select s.name
from Students s join Friends f on s.ID = f.ID
    join Packages p on s.ID = p.ID
    join Packages pf on f.Friend_ID = pf.ID
where pf.salary > p.salary
order by pf.salary;