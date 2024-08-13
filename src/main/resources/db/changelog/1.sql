--liquibase formatted sql

--changeset oleg:1

create table customer
(
    id       bigserial   not null,
    login    varchar(32) not null,
    password varchar(64) not null,
    role     varchar(25) not null
);

insert into customer(login, password, role)
values ('oleg', 'oleg', 'ADMIN'),
       ('ivan', 'ivan', 'USER')

--changeset oleg:3

    insert into customer(login, password, role)
values ('basya', 'oleg', 'ADMIN'),
    ('vlad', 'ivan', 'USER')




