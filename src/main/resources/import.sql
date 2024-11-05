INSERT INTO categoria (id_categoria, nombre_categoria) VALUES (1, 'Comida');
INSERT INTO categoria (id_categoria, nombre_categoria) VALUES (2, 'Suplemento');
INSERT INTO categoria (id_categoria, nombre_categoria) VALUES (3, 'Aseo');

INSERT INTO producto (id_producto, nombre_producto, descripcion, precio, disponibilidad, imagen, id_categoria) VALUES (1, 'Br For Dog - Pure Puppy Lamb', 'Alimento balanceado que tiene como ingredientes cordero, harina de arroz integral, hojuelas de papas secas, semilla de linaza, pulpa de remolacha, harina de algarrobo, vitaminas, minerales, frutas y extractos de plantas', 30940, true, '../img/productos/br-for-dogs-puppy.png', 1);
INSERT INTO producto (id_producto, nombre_producto, descripcion, precio, disponibilidad, imagen, id_categoria) VALUES (2, 'Arquivet Fresh Free Run Turkey', 'Alimento completo semihúmedo para todo tipo de perros adultos, con un 55% de pavo fresco, un 20% de pescado fresco y un 25% de vegetales, frutas y hierbas medicinales. Prensado en frío, no extruido, procesamiento mínimo. Sin gluten, sin harinas cárnicas, sin colorantes ni aromatizantes artificiales. Cocinado lentamente y a baja temperatura.', 204736, true, '../img/productos/arquivet-fresh-pavo.webp', 1);
INSERT INTO producto (id_producto, nombre_producto, descripcion, precio, disponibilidad, imagen, id_categoria) VALUES (3, 'Hill’s Science Diet Adult 7+', 'Alimento específicamente formulado para ayudar a los perros de 7 años o más a mantenerse sanos a medida que envejecen. Desarrollado por científicos y nutriólogos de Hill’s, este alimento para perros de 7 años o más está hecho con ingredientes naturales más vitaminas, minerales y aminoácidos, y no contiene colores, sabores o conservadores artificiales. También proporciona una mezcla de antioxidantes clínicamente comprobada para favorecer un sistema inmunológico sano.', 95900, true, '../img/productos/hills.png', 1);
INSERT INTO producto (id_producto, nombre_producto, descripcion, precio, disponibilidad, imagen, id_categoria) VALUES (4, 'Alimento Húmedo en Lata para Perros Royal Canin Gastro Intestinal', 'Alimento especialmente formulado para perros con dificultades al digerir grasa. Has probado de todo para ayudar a tu perro con sus problemas gastrointestinales, sean vomito, diarrea, o falta de apetito. Y aunque las dietas caseras blandas son utilizadas frecuentemente para trastornos digestivos, tu peludo puede estar perdiendo algunos nutrientes fundamentales para su total recuperación.', 28600, true, '../img/productos/Royal-canin.jpg', 1);
INSERT INTO producto (id_producto, nombre_producto, descripcion, precio, disponibilidad, imagen, id_categoria) VALUES (5, 'Oven Baked Tradition Semi Humedo Adulto All Breed Chicken', 'Alimento semi húmedo para perros adultos de todas las razas en base a pollo.', 25990, true, '../img/productos/oven-baked-tradition.jpg', 1);
INSERT INTO producto (id_producto, nombre_producto, descripcion, precio, disponibilidad, imagen, id_categoria) VALUES (6, 'Dog''s Natural Care - Jabón Origen Spa Herbal', 'Ideal para minimizar impurezas y usar en pieles expuestas a cambios de ambiente, para mascotas aventureras que se exponen a microorganismos y ectoparásitos. Sus aceites ayudan a dar vitalidad y brillo al pelaje.', 18700, true, '../img/productos/Jabon-NaturalCare.jpg', 3);
INSERT INTO producto (id_producto, nombre_producto, descripcion, precio, disponibilidad, imagen, id_categoria) VALUES (7, 'Petys - Paños Húmedos Anti Bacterial Con Clorhexidina', 'Paños húmedos petys anti bacterial con clorhexidina - 40 unidades, Hipo alergénicos. dejan una agradable fragancia en la mascota, los deja listos para disfrutar de su día, limpiándolos para eliminar la suciedad y el mal olor que pueden adquirir entre baño y baño, ideal para ser manipulado por humanos.', 11000, true, '../img/productos/Panos.jpg', 3);
INSERT INTO producto (id_producto, nombre_producto, descripcion, precio, disponibilidad, imagen, id_categoria) VALUES (8, 'Omega 3 para Perros', 'Suplemento rico en ácidos grasos esenciales para mejorar la salud de la piel y el pelaje.', 19990, true, '../img/productos/omega3.png', 2);
INSERT INTO producto (id_producto, nombre_producto, descripcion, precio, disponibilidad, imagen, id_categoria) VALUES (9, 'Multivitamínico Completo', 'Un suplemento diario con vitaminas y minerales esenciales para mantener a tu perro activo y saludable.', 24990, true, '../img/productos/multivitaminico.webp', 2);
INSERT INTO producto (id_producto, nombre_producto, descripcion, precio, disponibilidad, imagen, id_categoria) VALUES (10, 'Glucosamina para Articulaciones', 'Suplemento que ayuda a mejorar la movilidad y a fortalecer las articulaciones de perros mayores o activos.', 29990, true, '../img/productos/glucosamina.png', 2);
INSERT INTO producto (id_producto, nombre_producto, descripcion, precio, disponibilidad, imagen, id_categoria) VALUES (11, 'Caja Junior Saludable', 'Caja personalizada para cachorros en crecimiento, que incluye alimentos ricos en nutrientes para apoyar el desarrollo, suplementos vitamínicos para fortalecer el sistema inmunológico y productos de aseo para pieles delicadas.', 170000, true, '../img/productos/Caja-cachorro.png', 2);
INSERT INTO producto (id_producto, nombre_producto, descripcion, precio, disponibilidad, imagen, id_categoria) VALUES (12, 'Caja Senior Vitalidad', 'Esta caja está diseñada para perros mayores. Contiene alimentos altos en fibra, suplementos para las articulaciones, y productos de bienestar como cepillos suaves para pelajes maduros.', 200000, true, '../img/productos/Caja-senior.png', 2);
INSERT INTO producto (id_producto, nombre_producto, descripcion, precio, disponibilidad, imagen, id_categoria) VALUES (13, 'Caja Perrito Sensible', 'Productos especializados para el cuidado del pelaje, incluyendo cepillos suaves, toallitas antibacteriales, y shampoo especializado para problemas de piel sensibles.', 130000, true, '../img/productos/Caja-perro-sensible.png', 3);
INSERT INTO producto (id_producto, nombre_producto, descripcion, precio, disponibilidad, imagen, id_categoria) VALUES (14, 'Caja Energía Activa', 'Esta caja es ideal para perros enérgicos. Contiene alimentos ricos en proteínas y grasas saludables, además de suplementos para mantener la energía y productos de aseo para un pelaje brillante.', 190000, true, '../img/productos/Caja-energia.png', 2);

INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (1, 'MINI');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (1, 'PEQUEÑO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (1, 'MEDIANO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (1, 'GRANDE');

INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (2, 'MEDIANO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (2, 'GRANDE');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (2, 'GIGANTE');

INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (3, 'MEDIANO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (3, 'GRANDE');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (3, 'GIGANTE');

INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (4, 'MEDIANO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (4, 'GRANDE');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (4, 'GIGANTE');

INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (5, 'MEDIANO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (5, 'GRANDE');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (5, 'GIGANTE');

INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (6, 'MINI');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (6, 'PEQUEÑO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (6, 'MEDIANO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (6, 'GRANDE');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (6, 'GIGANTE');

INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (7, 'MINI');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (7, 'PEQUEÑO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (7, 'MEDIANO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (7, 'GRANDE');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (7, 'GIGANTE');

INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (8, 'MINI');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (8, 'PEQUEÑO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (8, 'MEDIANO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (8, 'GRANDE');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (8, 'GIGANTE');

INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (9, 'MINI');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (9, 'PEQUEÑO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (9, 'MEDIANO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (9, 'GRANDE');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (9, 'GIGANTE');

INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (10, 'MINI');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (10, 'PEQUEÑO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (10, 'MEDIANO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (10, 'GRANDE');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (10, 'GIGANTE');

INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (11, 'MINI');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (11, 'PEQUEÑO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (11, 'MEDIANO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (11, 'GRANDE');

INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (12, 'PEQUEÑO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (12, 'MEDIANO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (12, 'GRANDE');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (12, 'GIGANTE');

INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (13, 'MINI');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (13, 'PEQUEÑO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (13, 'MEDIANO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (13, 'GRANDE');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (13, 'GIGANTE');

INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (14, 'MINI');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (14, 'PEQUEÑO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (14, 'MEDIANO');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (14, 'GRANDE');
INSERT INTO producto_tamanio (id_producto, tamanio) VALUES (14, 'GIGANTE');

-- Rango de Edad
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (1, 'BABY');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (1, 'CACHORRO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (2, 'ADULTO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (3, 'ADULTO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (3, 'SENIOR');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (4, 'ADULTO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (4, 'SENIOR');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (5, 'ADULTO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (5, 'SENIOR');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (6, 'BABY');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (6, 'CACHORRO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (6, 'ADULTO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (6, 'SENIOR');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (7, 'BABY');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (7, 'CACHORRO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (7, 'ADULTO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (7, 'SENIOR');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (8, 'BABY');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (8, 'CACHORRO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (8, 'ADULTO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (8, 'SENIOR');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (9, 'BABY');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (9, 'CACHORRO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (9, 'ADULTO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (9, 'SENIOR');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (10, 'ADULTO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (10, 'SENIOR');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (11, 'BABY');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (11, 'CACHORRO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (12, 'ADULTO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (12, 'SENIOR');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (13, 'BABY');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (13, 'CACHORRO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (13, 'ADULTO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (13, 'SENIOR');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (14, 'CACHORRO');
INSERT INTO producto_rango_edad (id_producto, rango_edad) VALUES (14, 'ADULTO');
