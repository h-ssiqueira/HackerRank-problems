select months*salary as total,count(*) from Employee group by total order by total desc limit 1;