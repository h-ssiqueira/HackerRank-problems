select w.id, wp.age, w.coins_needed, w.power
from Wands as w join Wands_Property as wp on w.code = wp.code
where wp.is_evil != 1 and w.coins_needed = (select min(coins_needed) from Wands as wa join Wands_Property as wap on wa.code = wap.code where wa.power = w.power and wap.age = wp.age)
order by w.power desc, wp.age desc;