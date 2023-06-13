create table ARBITRO (
    idarbitro int not null UNIQUE,
    direccion varchar(100),
    num_tel bigint
)
    INHERITS (PARTICIPANTE);
INSERT INTO ARBITRO VALUES ('23A45', 'Elara Nightshade', 2, 35, 1.62, 73, 1,'Habilitado', 123,'123 Maple Street, Toronto, Ontario, Canada',14165551234),
('67A89', 'Caspian Whitewood', 4, 28, 1.79, 87, 1,'Habilitado', 456,'Hauptstraße 1, Berlin, Alemania',49305555678),
('81A23', 'Luna Stargazer', 6, 52, 1.75, 72, 2,'Habilitado', 789,'456 Mahatma Gandhi Road, Mumbai, India', 912255556789),
('45A67', 'Maximilian Ravenscar', 8, 48, 1.83, 96, 2,'Habilitado', 812,'Avenida Juárez 789, CDMX, Mexico',525555551234);