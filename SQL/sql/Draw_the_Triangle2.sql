set @rows = 0;
select repeat('* ', @rows := @rows + 1) from information_schema.tables where @rows < 20;