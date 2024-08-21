--liquibase formatted sql

--changeset oleg:7


create table user_trainings_info
(
    id               BIGSERIAL
        constraint user_trainings_info_pk
            primary key,
    info_id          BIGINT
        constraint user_trainings_info_info_types_id_fk
            references info_types,
    information      VARCHAR,
    user_trianing_id BIGINT
        constraint user_trainings_info_user_trainings_id_fk
            references user_trainings
);


