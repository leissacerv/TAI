create table HOTEL(
    rfc int not null,
    nhotel varchar(100) not null,
    num_tel bigint,
    direccion varchar(100),
    fecha_aloj varchar(100),
    constraint pk_rfc primary key (rfc)
);
INSERT INTO HOTEL VALUES (777, 'El Caldero Chorreante', 442012345678, 'Calle de los Magos 456, Londres, Reino Unido', '22 de Marzo'),
(333, 'La Lechucería', 4413198765432, 'Avenida del Búho 789, Hogsmeade, Escocia', '22 de Marzo');