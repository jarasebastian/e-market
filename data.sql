-- CATEGORIES
INSERT INTO categories VALUES (1, 'Fruits and Vegetables', true);
INSERT INTO categories VALUES (2, 'Cake Shop', true);
INSERT INTO categories VALUES (3, 'Meat and Fish', true);
INSERT INTO categories VALUES (4, 'Dairy and Eggs', true);
INSERT INTO categories VALUES (5, 'Soft Drinks', true);
INSERT INTO categories VALUES (6, 'Liquors', true);
INSERT INTO categories VALUES (7, 'Personal Care', true);
INSERT INTO categories VALUES (8, 'Pantry', true);

-- PRODUCTS
INSERT INTO products VALUES (1, 'Guava', 1, '7029 A42 23', 300, 500, true);
INSERT INTO products VALUES (2, 'Mango', 1, '0316 R56 01', 2100, 250, true);
INSERT INTO products VALUES (3, 'Apple', 1, '7923 T23 19', 700, 130, true);
INSERT INTO products VALUES (4, 'Avocado', 1, '9322 Q33 02', 2500, 98, true);
INSERT INTO products VALUES (5, 'Lettuce', 1, '9742 S22 21', 4000, 86, true);
INSERT INTO products VALUES (6, 'Tomato', 1, '0483 R00 97', 290, 430, true);
INSERT INTO products VALUES (7, 'Pear', 1, '9999 X10 01', 750, 210, true);
INSERT INTO products VALUES (8, 'Celery', 1, '3390 F29 45', 150, 115, true);
INSERT INTO products VALUES (9, 'Papaya', 1, '5291 J34 32', 4500, 73, true);
INSERT INTO products VALUES (10, 'Lemon', 1, '7886 N18 32', 350, 425, true);
INSERT INTO products VALUES (11, 'Brownie', 2, '6683 H15 20', 2500, 80, true);
INSERT INTO products VALUES (12, 'Bread', 2, '5745 F05 47', 4500, 120, true);
INSERT INTO products VALUES (13, 'Pound Cake', 2, '3831 D97 99', 10000, 35, true);
INSERT INTO products VALUES (14, 'Tortilla', 2, '4335 Z33 84', 6400, 87, true);
INSERT INTO products VALUES (15, 'Toasts', 2, '6584 M19 25', 4000, 45, true);
INSERT INTO products VALUES (16, 'Snickers', 2, '4487 S00 97', 2000, 105, true);
INSERT INTO products VALUES (17, 'Salmon', 3, '4546 A00 01', 28000, 55, true);
INSERT INTO products VALUES (18, 'Haunch', 3, '3678 E57 22', 12000, 32, true);
INSERT INTO products VALUES (19, 'Beef', 3, '8893 O01 03', 7800, 40, true);
INSERT INTO products VALUES (20, 'Pork Ribs', 3, '4534 Q12 88', 8600, 70, true);
INSERT INTO products VALUES (21, 'Tilapia', 3, '5684 R53 02', 17000, 60, true);
INSERT INTO products VALUES (22, 'Hake', 3, '3523 R04 00', 23000, 45, true);
INSERT INTO products VALUES (23, 'Cow Milk', 4, '2323 T56 33', 2500, 500, true);
INSERT INTO products VALUES (24, 'Cheese', 4, '7786 K19 56', 4000, 300, true);
INSERT INTO products VALUES (25, 'Free Range Eggs', 4, '3478 M74 01', 400, 1000, true);
INSERT INTO products VALUES (26, 'Egg White', 4, '7932 R31 46', 3200, 200, true);
INSERT INTO products VALUES (27, 'Tartar Sauce', 4, '5463 W23 33', 9000, 110, true);
INSERT INTO products VALUES (28, 'Water', 5, '8965 I32 11', 2000, 600, true);
INSERT INTO products VALUES (29, 'Orange Juice', 5, '7445 T87 44', 7400, 200, true);
INSERT INTO products VALUES (30, 'Coca-Cola', 5, '3434 R34 63', 3100, 175, true);
INSERT INTO products VALUES (31, 'Strawberry Juice', 5, '9753 W33 19', 8250, 630, true);
INSERT INTO products VALUES (32, 'Tea', 5, '9836 F35 69', 1900, 450, true);
INSERT INTO products VALUES (33, 'Beer', 6, '3432 G67 21', 2100, 800, true);
INSERT INTO products VALUES (34, 'Tequila', 6, '9529 E45 98', 65000, 764, true);
INSERT INTO products VALUES (35, 'Ron', 6, '1947 R07 53', 55000, 240, true);
INSERT INTO products VALUES (36, 'Whiskey', 6, '3160 A54 94', 40000, 480, true);
INSERT INTO products VALUES (37, 'Red Wine', 6, '7891 W46 95', 82000, 560, true);
INSERT INTO products VALUES (38, 'Toothpaste', 7, '6310 C99 73', 7500, 200, true);
INSERT INTO products VALUES (39, 'Hand Soap', 7, '9371 J14 75', 4900, 90, true);
INSERT INTO products VALUES (40, 'Mouth Wash', 7, '1942 T68 01', 12000, 105, true);
INSERT INTO products VALUES (41, 'Shampoo', 7, '6789 W01 23', 9300, 200, true);
INSERT INTO products VALUES (42, 'Desodorante', 7, '7333 S21 36', 6900, 85, true);
INSERT INTO products VALUES (43, 'Rice', 8, '4676 I83 00', 3500, 600, true);
INSERT INTO products VALUES (44, 'Lentils', 8, '7333 S21 36', 3000, 560, true);
INSERT INTO products VALUES (45, 'All-Purpose Flour', 8, '7333 S21 36', 1800, 300, true);
INSERT INTO products VALUES (46, 'Salt', 8, '7333 S21 36', 1400, 500, true);
INSERT INTO products VALUES (47, 'Olive Oil', 8, '7333 S21 36', 6500, 135, true);
INSERT INTO products VALUES (48, 'Cereal', 8, '4673 K53 98', 7000, 75, true);
INSERT INTO products VALUES (49, 'Green Beans', 8, '2745 F40 45', 8200, 270, true);
INSERT INTO products VALUES (50, 'Coffee', 8, '6351 R33 92', 7200, 400, true);

-- CUSTOMERS
INSERT INTO customers VALUES ('4546221', 'Johannes', 'Kepler', 3104583224, 'Cl 3 # 33 - 33', 'kepler@me.com');
INSERT INTO customers VALUES ('2552243', 'Galileo', 'Galilei', 3462257293, 'Cl 1 # 11 - 11', 'gali@leo.com');
INSERT INTO customers VALUES ('983824', 'Nicolaus', 'Copernicus', 3019392466, 'Cl 2 # 22 - 22', 'nico@cope.com');

-- PURCHASE
INSERT INTO purchases VALUES (1, '4546221', TO_TIMESTAMP('10/08/1992 17:30:00','DD/MM/YYYY HH24:MI:SS'), 'E', '', 'P');
INSERT INTO purchases_products VALUES (1, 1, 10, 3000, true);
INSERT INTO purchases_products VALUES (1, 36, 1, 40000, true);
INSERT INTO purchases_products VALUES (1, 27, 1, 9000, true);
INSERT INTO purchases_products VALUES (1, 49, 2, 16400, true);
INSERT INTO purchases_products VALUES (1, 24, 1, 4000, true);

-- THE SEQUENCES ARE REBOOTED ACCORDING TO THE INITIAL DATA
SELECT setval('public.products_product_id_seq', 50, true);
SELECT setval('public.categories_category_id_seq', 8, true);
SELECT setval('public.purchases_purchase_id_seq', 1, true);