CREATE TABLE post(id SERIAL PRIMARY KEY, post varchar(255), user_fk int REFERENCES user(id)VALUES(1,"post",1));