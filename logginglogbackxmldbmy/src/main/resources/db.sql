
create table transaction (
                             event_id serial primary key ,
                             message varchar,
                             level varchar,
                             date timestamp
);
