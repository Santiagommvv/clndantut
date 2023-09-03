CREATE TABLE IF NOT EXISTS Content (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description text,
    status VARCHAR(20) NOT NULL,
    content_type VARCHAR(50) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_updated TIMESTAMP,
    url VARCHAR(255)
);

--enh2--
--id INTEGER AUTO_INCREMENT,--
--INSERT INTO Content(title,description,status,content_type,date_created)--
--VALUES('Mi posteo de arte','sobre el arte de postear','IDEA','ARTICLE', CURRENT_TIMESTAMP());--
--enh2 termina en--
--primary key (id)--
