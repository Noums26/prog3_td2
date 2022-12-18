CREATE TABLE team
(
    id serial primary key,
    name varchar(25) not null unique
);

CREATE TABLE player(
    id serial primary key,
    name varchar(125) not null,
    number int not null,
    team_id int references team(id)
);

CREATE TABLE sponsor(
    id serial primary key,
    name varchar(125)
);

CREATE TABLE have_sponsor(
    id serial primary key,
    team_id int references team(id),
    sponsor_id int references sponsor(id)
);

CREATE TABLE play_against(
    id serial primary key,
    datetime timestamp not null,
    stadium varchar(50),
    team_id_1 int references team(id),
    team_id_2 int references team(id)
);