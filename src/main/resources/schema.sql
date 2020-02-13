DROP TABLE IF EXISTS foodstuff;

CREATE TABLE foodstuff (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  price DECIMAL(8,2) NOT NULL,
  quantity_for_deliver DECIMAL(10,3) NOT NULL,
  deliver_state VARCHAR(100) NOT NULL,
  on_kitchen_state VARCHAR(100) NOT NULL,
  unit VARCHAR(100) NOT NULL
  );