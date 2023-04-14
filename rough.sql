-- table name: user
-- columns: id,pk
-- message_sent int freq
-- message_delivered int freq
-- message_read int freq
-- created_at timestamp

-- data requested: date range given - 1 march to 14 march
-- selected data 1 feb to 15 feb 
-- jinko message selected date mai jachuka, freq > 2 and lie between date requested

SELECT * 
FROM user
WHERE message_sent > 2 AND created_at BETWEEN "2023-03-01" AND "2023-03-14"
AND id in (
    SELECT *
    FROM user
    WHERE created_at BETWEEN "2023-02-01" AND "2023-02-15"
);

-- date



