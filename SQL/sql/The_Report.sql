select if(grade >= 8, s.Name, NULL), g.grade, s.Marks from Students as s join Grades as g
where s.Marks between g.Min_Mark and g.Max_Mark
order by g.grade desc, s.name, s.Marks;