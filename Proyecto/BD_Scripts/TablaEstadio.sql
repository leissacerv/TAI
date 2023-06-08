create table ESTADIO (
    idestadio int not null,
    fk_qhotel int not null,
    nestadio varchar(100) not null,
    capacidad int,
    constraint pf_idestadio primary key (idestadio),
    foreign key (fk_qhotel) references HOTEL(rfc)
);
-----------Tabla ESTADIO---- ID, IDHOTEL, NOMBRE, CAPACIDAD
INSERT INTO ESTADIO VALUES (12345, 777, 'Cresta de Dragon',30000),
(67890, 777, 'Bosque Perdido',40000),
(23456, 333, 'Colina de las Lechuzas',25000),
(78901, 333, 'Lago Negro',35000);