create table PARTICIPANTE (
    curp varchar(100) not null,
    nombre_comp varchar(100) not null,
    fk_idpais int not null,
    edad int,
    altura decimal,
    peso int,
    fk_hotel int,
    estado varchar(100),
    constraint pk_curp primary key (curp),
    foreign key (fk_idpais) references PAIS(idpais),
    foreign key (fk_hotel) references HOTEL(rfc)
);
