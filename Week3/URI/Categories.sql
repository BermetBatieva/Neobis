SELECT a.id, a.name
FROM products as a
JOIN categories as c
ON a.id_categories = c.id
WHERE c.name like 'super%'