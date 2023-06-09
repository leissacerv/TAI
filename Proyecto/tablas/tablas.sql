	
create table PAIS (
    idpais int not null,
    nombre varchar(100) not null,
    continente varchar(100),
    cant_clubs int,
    constraint pk_idpais primary key (idpais)
);


create table HOTEL(
    rfc int not null,
    nhotel varchar(100) not null,
    num_tel bigint,
    direccion varchar(100),
    fecha_aloj varchar(100),
    constraint pk_rfc primary key (rfc)
);

create table ESTADIO (
    idestadio int not null,
    fk_qhotel int not null,
    nestadio varchar(100) not null,
    capacidad int,
    constraint pf_idestadio primary key (idestadio),
    foreign key (fk_qhotel) references HOTEL(rfc)
);

create table EQUIPO (
    idequipo int not null,
    nombre varchar(100) not null,
    camp_mund varchar(100),
    jugada_esp varchar(100),
    copas_win int,
    num_jugadores int,
    constraint pk_idequipo primary key (idequipo)
);


create table PARTICIPANTE (
    curp varchar(100) not null,
    nombre_comp varchar(100) not null,
    fk_idpais int not null,
    edad int,
    altura decimal,
    peso int,
    fk_hotel int,
    estado varchar(100),
    constraint curp primary key (curp),
    foreign key (fk_idpais) references PAIS(idpais),
    foreign key (fk_hotel) references HOTEL(rfc)
);

create table ARBITRO (
    idarbitro int not null UNIQUE,
    direccion varchar(100),
    num_tel bigint
)
    INHERITS (PARTICIPANTE);

create table JUGADOR (
    fk_equipo int not null,
    posicion varchar(100),
    nivel int,
    foreign key (fk_equipo) references EQUIPO(idequipo)
)
    INHERITS (PARTICIPANTE);


create table PARTIDO (
    codigo int not null,
    fk_arbitro int not null,
    fk_qestadio int not null,
    fk_equipo_win int not null,
    constraint pk_codigo primary key (codigo),
    foreign key (fk_qestadio) references ESTADIO(idestadio),
    foreign key (fk_equipo_win) references EQUIPO(idequipo),
    foreign key (fk_arbitro) references ARBITRO(idarbitro)
);

create table MOV_PROHIBIDOS (
	idmov int not null,
    fk_partido int not null,
	nombre_mov varchar(100),
	cant_mov int,
    fk_moveq int,
	constraint pk_idmov primary key (idmov),
    foreign key (fk_partido) references PARTIDO(codigo),
    foreign key (fk_moveq) references EQUIPO(idequipo)
);