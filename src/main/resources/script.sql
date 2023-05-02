Create table customer(
id Serial primary key,
username varchar(50) not null,
password varchar(500) not null,
role varchar(50) not null
)

Insert into customer(id, username, password, role)
values(1, 'tk1', 'ps1', 'admin')