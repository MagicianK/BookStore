create table Customers(
	Customer_id int not null primary key,
	FirstName varchar(32),
	LastName varchar(32)
);

create table Books(
	Book_id int not null primary key,
	BookName varchar(32),
	Price int,
	Category varchar(32)
);

create table Carts(
	Cart_id int not null primary key,
	Customer_id int,
	foreign key(Customer_id) references Customers(Customer_id)
);
create table Cart_content(
	Cart_id int,
	Book_id int,
	Books_amount int,
	foreign key(Cart_id) references Carts(Cart_id),
	foreign key(Book_id) references Books(Book_id)
);

insert into Customers values
(1000, 'Nezuko', 'Kamado'),
(1001, 'Zenitsu', 'Agatsuma'),
(1002, 'Tanjiro', 'Kamado');


insert into Books values
(6000, 'Biography of Tanjiro Kamado', 100, 'Biography'),
(6001, 'Pigs', 200, 'Animals'),
(6002, 'Sword art', 1000, 'Weapons'),
(6003, 'Biography of Nezuko Kamado', 100, 'Biography'),
(6004, 'Discrete mathematics intro', 2000, 'Science'),
(6005, 'Calculus', 2000, 'Science'),
(6006, 'Physics', 2000, 'Science'),
(6007, 'Chemistry', 2000, 'Science'),
(6008, 'The basics of programming', 100, 'Programming'),
(6009, 'Learning java', 1000, 'Programming');

insert into Carts values
(8000, 1000),
(8001, 1001),
(8002, 1002);
