CREATE TABLE `users_stock` (
  `users_id` BIGINT NOT NULL,
  `stock_id` BIGINT NOT NULL,
  PRIMARY KEY (`users_id`, `stock_id`),
  CONSTRAINT `fk_users2_stock_users_id`
    FOREIGN KEY (`users_id`) REFERENCES `users` (`id`),
  CONSTRAINT `fk_users2_stock_stock_id`
    FOREIGN KEY (`stock_id`) REFERENCES `stock` (`id`)
);


CREATE TABLE `transactions` (
id bigint NOT NULL AUTO_INCREMENT,
  `users_id` BIGINT NOT NULL,
  `stock_id` BIGINT NOT NULL,
  `transaction_date` DATE NOT NULL,
  `stock_amount` Int not NULL,


  PRIMARY KEY (id),
  CONSTRAINT `fk_users_transactions_id`
    FOREIGN KEY (`users_id`) REFERENCES `users` (`id`),
  CONSTRAINT `fk_stock_transactions_id`
    FOREIGN KEY (`stock_id`) REFERENCES `stock` (`id`)
);