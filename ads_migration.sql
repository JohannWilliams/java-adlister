use adlister_db;

drop table if exists ads;

create table ads(
    id int unsigned not null auto_increment,
    user_id int unsigned not null,
    title varchar(50) not null,
    description text not null,
    primary key (id),
    foreign key (user_id)
        references users(id)
);