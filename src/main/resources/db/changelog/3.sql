--liquibase formatted sql

--changeset oleg:5

alter table customer
    add constraint customer_pk
        primary key (id);

create table user_trainings
(
    id          BIGSERIAL not null
        constraint user_trainings_pk
            primary key,
    start_time  DATE      not null,
    end_time    DATE      not null,
    training_id BIGINT    not null
        constraint user_trainings_training_id_fk
            references training (id),
    user_id     BIGINT    not null
        constraint user_trainings_customer_id_fk
            references customer (id)
);

