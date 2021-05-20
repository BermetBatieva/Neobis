SELECT a.name, b.name
FROM products as a, providers as b
WHERE a.id_categories = 6 and a.id_providers = b.id