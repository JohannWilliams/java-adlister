use adlister_db;

drop table if exists users;

create table users(
    id int unsigned not null auto_increment,
    username varchar(50) not null,
    email varchar(100) not null,
    password varchar(50) not null,
    primary key (id)
);