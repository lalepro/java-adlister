USE adlister_db;

DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
      id INT UNSIGNED NOT NULL AUTO_INCREMENT,
      username VARCHAR(240) NOT NULL,
      email VARCHAR(240) NOT NULL,
      password VARCHAR(255) NOT NULL,
      PRIMARY KEY (id)
  );

CREATE TABLE ads (
      id INT UNSIGNED NOT NULL AUTO_INCREMENT,
      user_id INT UNSIGNED NOT NULL,
      title VARCHAR(240) NOT NULL,
      description TEXT NOT NULL,
      PRIMARY KEY (id),
      FOREIGN KEY (user_id) REFERENCES users(id)
          ON DELETE CASCADE
  );









SELECT * FROM ads;

SELECT * FROM users WHERE id = 1;

SELECT concat(username, ' ', email) as Contact, concat('Item: ',title, ' :', description) as Product
FROM users AS u
JOIN ads a ON u.id = a.user_id
ORDER BY description DESC;


