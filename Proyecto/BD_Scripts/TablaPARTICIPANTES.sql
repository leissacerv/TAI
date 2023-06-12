
create table PARTICIPANTE (
    num_part SERIAL,
    curp varchar(100) not null,
    nombre_comp varchar(100) not null,
    fk_idpais int not null,
    edad int,
    altura decimal,
    peso int,
    fk_hotel int,
    estado varchar(100),
    constraint num_part primary key (num_part),
    foreign key (fk_idpais) references PAIS(idpais),
    foreign key (fk_hotel) references HOTEL(rfc)
);
