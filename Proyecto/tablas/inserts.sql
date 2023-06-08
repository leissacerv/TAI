-----------Tabla PAIS-----
INSERT INTO PAIS VALUES (1,'Estados Unidos','America',3);
INSERT INTO PAIS VALUES (2,'Canada','America',3);
INSERT INTO PAIS VALUES (3,'Reino Unido','Europa',5);
INSERT INTO PAIS VALUES (4,'Alemania','Europa',2);
INSERT INTO PAIS VALUES (5,'Brasil','America',1);
INSERT INTO PAIS VALUES (6,'India','Asia del Sur',1);
INSERT INTO PAIS VALUES (7,'Rusia','Europa',3);
INSERT INTO PAIS VALUES (8,'Mexico','America',2);

-----------Tabla HOTEL------- id, nombre, numero cel, direccion y fecha de aloj
INSERT INTO HOTEL VALUES (777, 'El Caldero Chorreante', 442012345678, 'Calle de los Magos 456, Londres, Reino Unido', '22 de Marzo'),
(333, 'La Lechucería', 4413198765432, 'Avenida del Búho 789, Hogsmeade, Escocia', '22 de Marzo');

-----------Tabla ESTADIO---- ID, IDHOTEL, NOMBRE, CAPACIDAD
INSERT INTO ESTADIO VALUES (12345, 777, 'Cresta de Dragon',30000),
(67890, 777, 'Bosque Perdido',40000),
(23456, 333, 'Colina de las Lechuzas',25000),
(78901, 333, 'Lago Negro',35000);

----------Tabla EQUIPO-----
INSERT INTO EQUIPO VALUES (1,'Dragones de Fuego',1,'Vuelo de Dragon',0,7);
INSERT INTO EQUIPO VALUES (2,'Centauros Voladores',0,'Arremetida del Centauro',0,7);
INSERT INTO EQUIPO VALUES (3,'Griffindors Salvajes',3,'Desvío de la Esfinge',2,7);
INSERT INTO EQUIPO VALUES (4,'Espectros de la Tormenta',1,'Remolino de Sirenas',1,7);
INSERT INTO EQUIPO VALUES (5,'Basiliscos Alados',2,'Maldicion del Basilisco',1,7);
INSERT INTO EQUIPO VALUES (6,'Hipogrifos Dorados',0,'Salto de Hipogrifo',0,7);
INSERT INTO EQUIPO VALUES (7,'Serpientes de Plata',2,'Embate Fulgurante',1,7);
INSERT INTO EQUIPO VALUES (8,'Valquirias del Viento',3,'Lazo de las Hidras',2,7);


-----------Tabla ARBITRO-----
INSERT INTO ARBITRO VALUES ('23A45', 'Elara Nightshade', 2, 35, 1.62, 73, 777, 123,'123 Maple Street, Toronto, Ontario, Canada',14165551234),
('67A89', 'Caspian Whitewood', 4, 28, 1.79, 87, 777, 456,'Hauptstraße 1, Berlin, Alemania',49305555678),
('81A23', 'Luna Stargazer', 6, 52, 1.75, 72, 333, 789,'456 Mahatma Gandhi Road, Mumbai, India', 912255556789),
('45A67', 'Maximilian Ravenscar', 8, 48, 1.83, 96, 333, 812,'Avenida Juárez 789, CDMX, Mexico',525555551234);

-------TABLA DE JUGADOR----
INSERT INTO JUGADOR VALUES ('A1234', 'Alistair Blackthorn', 1, 19, 1.67, 60, 777, 1,'Guardian',2),
('B5678', 'Gwendolyn Fairchild', 1, 21, 1.57, 56, 777, 1,'Buscador',2),
('C9012', 'Ron Hawthorne', 1, 18, 1.75, 76, 777, 1,'Golpeador',3),
('D3456', 'Evangeline Moonshadow', 1, 22, 1.59, 65, 777, 1,'Golpeador',1),
('E7890', 'Orion Nightshade', 1, 19, 1.80, 85, 777, 1,'Cazador',2),
('F2345', 'Seraphina Evergreen', 1, 21, 1.62, 55, 777, 1,'Cazador',2),
('G6789', 'Caspian Thornfield', 1, 20, 1.76, 81, 777, 1,'Cazador',1),
('H0123', 'Arabella Ravenswood', 2, 18, 1.62, 58,777, 2,'Guardian',3),
('I4567', 'Maximus Ironwood', 2, 22, 1.82, 86, 777, 2,'Buscador',1),
('J8901', 'Ophelia Starling', 2, 19, 1.49, 45, 777, 2,'Golpeador',2),
('K2345', 'Phineas Stargazer', 2, 19, 1.78, 80, 777, 2,'Golpeador',1),
('L6789', 'Isadora Flintwood', 2, 20, 1.59, 63, 777, 2,'Cazador',3),
('M0123', 'Lucius Ravenscroft', 2, 22, 1.83, 79, 777, 2,'Cazador',3),
('N4567', 'Rosalind Holloway', 2, 19, 1.75, 50, 777, 2,'Cazador',1),
('O8901', 'Ambrose Pendragon', 3, 20, 1.56, 55, 777, 3,'Guardian',2),
('P2345', 'Rowena Whitewood', 3, 19, 1.59, 49, 777, 3,'Buscador',3),
('Q6789', 'Ignatius Blackwood', 3, 22, 1.85, 89, 777, 3,'Golpeador',2),
('R0123', 'Imogen Heartwood', 3, 18, 1.56, 55, 777, 3,'Golpeador',2),
('S4567', 'Augustus Ravenscar', 3, 20, 1.78, 80, 777, 3,'Cazador',1),
('T8901', 'Felicity Ashborne', 3, 19, 1.59, 55, 777, 3,'Cazador',2),
('U2345', 'Benedict Lightfoot', 3, 22, 1.79, 87, 777, 3,'Cazador',1),
('V6789', 'Seraphina Blackthorne', 4, 21, 1.56, 62, 777, 4,'Guardian',3),
('W0123', 'Atticus Gryffindor', 4, 22, 1.79, 84, 777, 4,'Buscador',1),
('X4567', 'Lavinia Nightshade', 4, 19, 1.62, 71, 777, 4,'Golpeador',2),
('Y8901', 'Octavius Winterbourne', 4, 20, 1.86, 89, 777, 4,'Golpeador',2),
('Z2345', 'Marigold Thistlebrook', 4, 21, 1.62, 58, 777, 4,'Cazador',3),
('1234A', 'Alaric Stormrider', 4, 22, 1.89, 95, 777, 4,'Cazador',1),
('5678B', 'Evangeline Moonstone', 4, 19, 1.65, 60, 777, 4,'Cazador',2),
('9012C', 'Orion Ravensdale', 5, 20, 1.87, 93, 333, 5,'Guardian',2),
('3456D', 'Arabella Hawthorne', 5, 21, 1.56, 62, 333, 5,'Buscador',2),
('7890E', 'Tristan Wilde', 5, 22, 1.79, 83, 333, 5,'Golpeador',3),
('2345F', 'Aurora Stargazer', 5, 18, 1.49, 45, 333, 5,'Golpeador',1),
('6789G', 'Cedric Thorne', 5, 22, 1.79, 73, 333, 5,'Cazador',2),
('0123H', 'Ophelia Everhart', 5, 19, 1.66, 79, 333, 5,'Cazador',2),
('4567I', 'Casimir Ravenshadow', 5, 18, 1.87, 92, 333, 5,'Cazador',1),
('8901J', 'Rosalind Thistledown', 6, 22, 1.65, 56, 333, 6,'Guardian',3),
('2345K', 'Lucinda Moonlight', 6, 19, 1.53, 43, 333, 6,'Buscador',3),
('6789L', 'Jasper Whitewood', 6, 21, 1.78, 86, 333, 6,'Golpeador',2),
('0123M', 'Penelope Ashthorn', 6, 19, 1.58, 65, 333, 6,'Golpeador',1),
('4567N', 'Magnus Nightshade', 6, 21, 1.79, 68, 333, 6,'Cazador',3),
('8901O', 'Evangeline Winterbourne', 6, 18, 1.64, 70, 333, 6,'Cazador',1),
('2345P', 'Phineas Blackthorn', 6, 22, 1.83, 76, 333, 6,'Cazador',2),
('6789Q', 'Cordelia Ravenswood', 7, 18, 1.58, 53, 333, 7,'Guardian',3),
('0123R', 'Silas Ironwood', 7, 21, 1.60, 67, 333, 7,'Buscador',2),
('4567S', 'Isolde Thornfield', 7, 18, 1.72, 75, 333, 7,'Golpeador',2),
('8901T', 'Caspar Hartwood', 7, 22, 1.85, 93, 333, 7,'Golpeador',2),
('2345U', 'Vivienne Ravenscar', 7, 19, 1.60, 54, 333, 7,'Cazador',2),
('6789V', 'Lysander Ashborne', 7, 20, 1.84, 91, 333, 7,'Cazador',3),
('0123W', 'Seraphina Lightfoot', 7, 18, 1.59, 65, 333, 7,'Cazador',1),
('4567X', 'Percival Moonshadow', 8, 20, 1.76, 87, 333, 8,'Guardian',2),
('8901Y', 'Imogen Holloway', 8, 19, 1.61, 57, 333, 8,'Buscador',2),
('2345Z', 'Alaric Pendragon', 8, 22, 1.69, 75, 333, 8,'Golpeador',2),
('A5678', 'Rowena Ashthorn', 8, 21, 1.48, 45, 333, 8,'Golpeador',3),
('B9012', 'Thaddeus Blackwood', 8, 18, 1.75, 87, 333, 8,'Cazador',2),
('C3456', 'Beatrix Ravensdale', 8, 20, 1.64, 60, 333, 8,'Cazador',3),
('D7890', 'Orion Flintwood', 8, 19, 1.74, 69, 333, 8,'Cazador',1);

-----------Tabla PARTIDO----- ID, FK ARB, FK ESTADIO, FKEQUIPO WIN
INSERT INTO PARTIDO VALUES (1, 123, 12345, 1),
(2, 456, 67890, 2),
(3, 789, 23456, 3),
(4, 812, 78901, 8),
(5, 123, 12345, 1),
(6, 456, 67890, 2),
(7, 789, 23456, 5),
(8, 812, 78901, 6),
(9, 123, 12345, 1),
(10, 456, 67890, 4),
(11, 789, 23456, 7),
(12, 812, 78901, 6),
(13, 123, 12345, 4),
(14, 456, 67890, 2),
(15, 789, 23456, 8),
(16, 812, 78901, 6),
(17, 123, 12345, 5),
(18, 456, 67890, 6),
(19, 789, 23456, 3),
(20, 812, 78901, 7),
(21, 123, 12345, 1),
(22, 456, 67890, 1),
(23, 789, 23456, 7),
(24, 812, 78901, 8),
(25, 123, 12345, 6),
(26, 456, 67890, 1),
(27, 789, 23456, 6),
(28, 812, 12345, 1);

-----------Tabla MOV_PROHIBIDOS----(id,fkpartido,nombremov,cantidad,fkmoveq)
INSERT INTO MOV_PROHIBIDOS VALUES (1,2,'Golpe intencional',2,5),
(2,4,'Obstruccion de camino',1,4),
(3,8,'Agarrar escoba contraria',1,7),
(4,15,'Intimidacion',1,5),
(5,20,'Abandono intencional',1,4),
(6,27,'Uso de hechizos',1,8);