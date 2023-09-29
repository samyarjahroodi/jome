CREATE TABLE IF NOT EXISTS users
(
    id          serial primary key,
    nameOfUsers varchar(50) not null
);
CREATE TABLE IF NOT EXISTS roles
(
    id          serial primary key,
    description varchar(50) not null,
    nameOfRoles varchar(50) not null
);
CREATE TABLE IF NOT EXISTS users_role
(
    idOfUsers int references users,
    idOfRole  int references roles
);
