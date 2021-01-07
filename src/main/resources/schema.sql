create database if not exists AccomodationApp;

create table if not exists user(
    id int not null auto_increment primary key,
    firstname varchar(100) not null,
    lastname varchar(100) not null,
    username varchar(100) not null,
    age int
);

create table if not exists location(
 id int not null auto_increment primary key,
      name varchar(100) not null
)

create table if not exists accomodation(
      id int not null auto_increment primary key,
      name varchar(100) not null,
      locationId int not null,
      address varchar(250) not null,
      NrOfRooms bigint not null,
      Utilities varchar(MAX) ,
      Description varchar(Max),
            constraint FK_Location_Accomodation foreign key (LocationId) references Location (Id)
)


create table  if not exists room(
id int not null auto_increment primary key,
AccomodationId int not null,
Name varchar(150),
NrOfPersons int not null,
NrOfRooms int not null,
NrOfRoomsReserved int not null
Utilities varchar(MAX) ,
      Description varchar(Max) ,
      constraint FK_Accomodation_Room foreign key (AccomodationId) references Accomodation (Id),

)

create table if not exists reservation(
id int not null auto_increment primary key,
roomId int not null,
UserId int not null,
StartDate DATE not null,
EndDate Date not null,
 constraint FK_Room_Reservation foreign key (RoomId) references Room (Id),
      constraint FK_User_Reservation foreign key (UserId) references User (Id)
)