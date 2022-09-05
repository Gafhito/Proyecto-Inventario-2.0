-- Creacion de la BD

create database if not exists inventario;
use inventario;


-- Creación de las tablas

create table if not exists categoria (
	id int primary key auto_increment,
	nombre varchar(45) not null
);

create table if not exists fabricante (
	id int primary key auto_increment,
    nombre varchar(45) not null
);

create table if not exists tipo_envio (
	id int primary key auto_increment,
    tipo varchar(45) not null
);

create table if not exists producto (
	id int primary key auto_increment,
    nombre varchar(45) not null,
    cantidad int not null,
    precio double not null,
    categoria int not null,
    fabricante int not null,
    foreign key (categoria) references categoria(id),
    foreign key (fabricante) references fabricante(id)
);

create table if not exists envio (
	producto_id int not null,
    envio_id int not null,
    foreign key (producto_id) references producto(id),
    foreign key (envio_id) references tipo_envio(id)
);


-- Datos de prueba:


-- Categorías
insert into categoria values (null, 'Tecnología');
insert into categoria values (null, 'Herrería');
insert into categoria values (null, 'Automóviles');
insert into categoria values (null, 'Carpintería');
insert into categoria values (null, 'Limpieza');
insert into categoria values (null, 'Comestibles');

-- Fabricantes
insert into fabricante values (null, 'Asus');
insert into fabricante values (null, 'HP');
insert into fabricante values (null, 'Goldex');
insert into fabricante values (null, 'Inco');
insert into fabricante values (null, 'Ayala');
insert into fabricante values (null, 'Acme');
insert into fabricante values (null, 'Jane');
insert into fabricante values (null, 'Cololo');
insert into fabricante values (null, 'Avanti');
insert into fabricante values (null, 'El Trigal');

-- Tipos de envío
insert into tipo_envio values (null, 'Reparto');
insert into tipo_envio values (null, 'Flete Externo');
insert into tipo_envio values (null, 'Agencia de Encomienda');

-- Productos de tecnología
insert into producto values (null, 'Laptop Asus TUF Gaming', 10, 21500.60, 1, 1);
insert into producto values (null, 'Laptop Asus Rog Strix', 5, 32100.80, 1, 1);
insert into producto values (null, 'Laptop HP Celeron', 30, 9500.90, 1, 2);

-- Productos de herrería
insert into producto values (null, 'Soldadora industrial', 30, 15600, 2, 3);
insert into producto values (null, 'Soldadora domestica', 80, 9000.50, 2, 4);
insert into producto values (null, 'Soldadora berreta', 88, 3200.80, 2, 6);

-- Productos de automóviles
insert into producto values (null, 'Repuestos motor', 239, 5000.40, 3, 5);

-- Productos de carpintería
insert into producto values (null, 'Tablones de segunda', 517, 399.90, 4, 6);
insert into producto values (null, 'Clavos', 92000, 99.99, 4, 6);
insert into producto values (null, 'Martillo', 630, 379.90, 4, 6);

-- Productos de limpieza
insert into producto values (null, 'Cloro', 274, 199.90, 5, 7);
insert into producto values (null, 'Perfumol', 453, 199.90, 5, 7);
insert into producto values (null, 'Repasadores', 30, 79.90, 5, 6);

-- Productos de comestibles
insert into producto values (null, 'Lata de arvejas', 15, 48.90, 6, 8);
insert into producto values (null, 'Lata de choclo', 60, 48.90, 6, 8);
insert into producto values (null, 'Tapas de empanadas', 30, 70.90, 6, 9);
insert into producto values (null, 'Masa Frolla', 44, 99.90, 6, 9);
insert into producto values (null, 'Granola', 20, 49, 6, 10);
insert into producto values (null, 'Cereales', 23, 39.99, 6, 10);

-- Productos con envíos
insert into envio values (14, 1);
insert into envio values (15, 1);
insert into envio values (16, 1);
insert into envio values (17, 1);
insert into envio values (18, 1);
insert into envio values (19, 1);
insert into envio values (7, 2);
insert into envio values (8, 2);
insert into envio values (1, 3);
insert into envio values (2, 3);
insert into envio values (3, 3);
