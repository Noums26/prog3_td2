CREATE TABLE team
(
    id serial primary key,
    name varchar(25) not null unique
);

CREATE TABLE player(
    id serial primary key,
    name varchar(125) not null,
    number int not null,
    id_equipe int references team(id)
);

CREATE TABLE sponsor(
    id serial primary key,
    name varchar(125)
);

CREATE TABLE have_sponsor(
    id serial primary key,
    id_team int references team(id),
    id_sponsor int references sponsor(id)
);

CREATE TABLE play_against(
    id serial primary key,
    datetime timestamp not null,
    stadium varchar(50),
    id_team_1 int references team(id),
    id_team_2 int references team(id)
);