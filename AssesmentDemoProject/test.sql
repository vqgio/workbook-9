SELECT customers.name, orders.order_date, order_items.quantity

FROM customers

         LEFT JOIN orders
                   ON customers.id = orders.customer_id

         LEFT JOIN order_items
                   ON orders.id = order_items.order_id;