create table AUTHOR (
    id INTEGER PRIMARY KEY,
    name VARCHAR(100)
);

create table POST (
  ID int not null,
  NAME varchar(100) not null,
  TEXT clob,
  AUTHOR_ID int not null,
  foreign key (AUTHOR_ID) REFERENCES AUTHOR(ID)
);