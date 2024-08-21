--liquibase formatted sql

--changeset oleg:4


create table training
(
    id       bigserial   not null,
    name     varchar(32) not null
);

insert into training(name)
values ('Кардио'),
       ('Силовые')