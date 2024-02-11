insert into user_details ( id,birth_date,name)
values(10001, current_date()-365,'Dane');
insert into user_details ( id,birth_date,name)
values(10002, current_date()-60,'Aamoy');
insert into user_details ( id,birth_date,name)
values(10003, current_date(),'Kelsey');

INSERT INTO post(id,description,user_id)
values(20001, 'I want to learn AWS', 10001);

INSERT INTO post(id,description,user_id)
values(20002, 'I want to learn DevOps', 10001);

INSERT INTO post(id,description,user_id)
values(20003, 'I want to learn Javs', 10003);

INSERT INTO post(id,description,user_id)
values(20004, 'I want to learn PHP', 10003);


INSERT INTO post(id,description,user_id)
values(20005, 'I want to get married', 10002);
