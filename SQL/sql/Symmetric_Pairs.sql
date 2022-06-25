select r1.x, r2.x
from functions r1 join functions r2 on r1.x = r2.y and r1.y = r2.x
group by r1.x, r2.x
having count(r1.x) > 1 or r1.x < r2.x
order by r1.x;