-- Table: users
CREATE TABLE users (
  id INT NOT  NULL PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(255) not null ,
  password VARCHAR(255) not null ,
  email varchar(255) not null ,
  tel varchar(255) not null
)