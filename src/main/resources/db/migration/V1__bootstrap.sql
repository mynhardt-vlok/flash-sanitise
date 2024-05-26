create table sanitise_token (
    id int unsigned not null primary key auto_increment,
    token varchar(255) not null unique
)