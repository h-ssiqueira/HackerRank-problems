set @rows = 21;
select repeat('* ', @rows := @rows - 1) from information_schema.tables;