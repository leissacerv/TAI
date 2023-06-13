create table ESTADIO (
    idestadio int not null,
    fk_qhotel int not null,
    nestadio varchar(100) not null,
    capacidad int,
    constraint pf_idestadio primary key (idestadio),
    foreign key (fk_qhotel) references HOTEL(rfc)
);
INSERT INTO ESTADIO VALUES (12345, 1, 'Cresta de Dragon',30000),
(67890, 1, 'Bosque Perdido',40000),
(23456, 2, 'Colina de las Lechuzas',25000),
(78901, 2, 'Lago Negro',35000);
