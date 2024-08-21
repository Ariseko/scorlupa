--liquibase formatted sql

--changeset oleg:6

create table info_types
(
    id   BIGSERIAL not null
        constraint info_types_pk
            primary key,
    name VARCHAR   not null
);

insert into info_types(name)
values ('Каллории'),
       ('Приседания'),
       ('Расстояние')

