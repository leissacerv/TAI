	
create table PAIS (
    idpais int not null,
    nombre varchar(100) not null,
    continente varchar(100),
    cant_clubs int,
    constraint pk_idpais primary key (idpais)
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
    curp int not null,
    nombre_comp varchar(100) not null,
    nacion varchar(100) not null,
    edad int,
    altura int,
    peso int,
    constraint pk_curp primary key (curp),
    foreign key fk_nacion references PAIS(nombre)
);

create table JUGADOR (
    equipo varchar(100) not null,
    posicion varchar(100),
    nivel int,
    foreign key fk_equipo references EQUIPO(nombre)
)
    INHERITS (PARTICIPANTE);

create table ARBITRO (
    direccion varchar(100),
    nul_tel int
)
    INHERITS (PARTICIPANTE);

create table HOTEL(
    rfc int not null,
    nhotel varchar(100) not null,
    num_tel int,
    direccion varchar(100),
    fecha_aloj varchar(100),
    constraint pk_rfc primary key (rfc)
);

create table ESTADIO (
    qhotel varchar(100) not null,
    nestadio varchar(100) not null,
    capacidad int,
    foreign key fk_qhotel references HOTEL(nhotel)
);

create table PARTIDO (
    codigo int not null,
    arbitro varchar (100),
    qestadio varchar(100),
    equipo_win varchar(100),
    constraint pk_codigo primary key (codigo),
    foreign key fk_qestadio references ESTADIO(nestadio),
    foreign key fk_equipowin references EQUIPO(nombre),
    foreign key fk_arbitro references ARBITRO(nombre_comp)
);

create table MOV_PROHIBIDOS (
	idmov int primary key,
	nombre_mov varchar(100),
	cant_mov int,
	constraint pk_idmov primary key (idmov)
);