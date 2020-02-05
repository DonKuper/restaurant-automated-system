DROP TABLE IF EXISTS foodstuff;

CREATE TABLE foodstuff (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  price DECIMAL(8,2) NOT NULL
  );