CREATE TABLE `users_stock` (
  `users_id` BIGINT NOT NULL,
  `stock_id` BIGINT NOT NULL,
  PRIMARY KEY (`users_id`, `stock_id`),
  CONSTRAINT `fk_users2_stock_users_id`
    FOREIGN KEY (`users_id`) REFERENCES `users` (`id`),
  CONSTRAINT `fk_users2_stock_stock_id`
    FOREIGN KEY (`stock_id`) REFERENCES `stock` (`id`)
);
