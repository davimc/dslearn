INSERT INTO tb_user (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob Hothman', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDIENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('Curso HTML','https://cdn.pixabay.com/photo/2021/03/18/17/09/teacher-6105336_960_720.png','https://mir-s3-cdn-cf.behance.net/project_modules/disp/816f5d7636141.560aef70c492f.jpg');

INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('1.0',TIMESTAMP WITH TIME ZONE '2020-07-14T00:00:00Z', TIMESTAMP WITH TIME ZONE '2021-07-14T00:00:00Z',1);
INSERT INTO tb_offer (edition, start_moment, end_moment,course_id) VALUES ('2.0',TIMESTAMP WITH TIME ZONE '2021-04-28T00:00:00Z', TIMESTAMP WITH TIME ZONE '2022-04-28T00:00:00Z',1);
INSERT INTO tb_offer (edition, start_moment, end_moment,course_id) VALUES ('2.1',TIMESTAMP WITH TIME ZONE '2022-08-21T00:00:00Z', TIMESTAMP WITH TIME ZONE '2023-08-21T00:00:00Z',1);

INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Primeiro feedback de tarefa: favor revisar', TIMESTAMP WITH TIME ZONE '2020-12-10T13:00:00Z', true, '/offers/1/resource/1/sections/1', 1);
INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Segundo feedback: favor revisar', TIMESTAMP WITH TIME ZONE '2020-12-12T13:00:00Z', true, '/offers/1/resource/1/sections/1', 1);
INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Terceiro feedback: favor revisar', TIMESTAMP WITH TIME ZONE '2020-12-14T13:00:00Z', true, '/offers/1/resource/1/sections/1', 1);

INSERT INTO tb_resource (title, description, position, img_uri, type, offer_id) VALUES ('Trilha inicial', 'inicie aqui', 1, 'https://cdn.pixabay.com/photo/2021/03/18/17/09/teacher-6105336_960_720.png', 1, 1)
INSERT INTO tb_resource (title, description, position, img_uri, type, offer_id, external_Link) VALUES ('Trilha intermediaria', 'continue aqui', 2, 'https://cdn.pixabay.com/photo/2021/03/18/17/09/teacher-6105336_960_720.png', 2, 1, 'youtube.com/astU2wgMSa')
INSERT INTO tb_resource (title, description, position, img_uri, type, offer_id) VALUES ('Trilha final', 'finalize aqui', 3, 'https://cdn.pixabay.com/photo/2021/03/18/17/09/teacher-6105336_960_720.png', 0, 1)

INSERT INTO tb_section (title, description, position, img_uri, prerequisite_id, resource_id) VALUES ('Visão geral', 'o que irá aprender', 1, 'https://mir-s3-cdn-cf.behance.net/project_modules/disp/816f5d7636141.560aef70c492f.jpg', null, 1)
INSERT INTO tb_section (title, description, position, img_uri, prerequisite_id, resource_id) VALUES ('Aula ao vivo', 'tirando dúvidas', 2, 'https://mir-s3-cdn-cf.behance.net/project_modules/disp/816f5d7636141.560aef70c492f.jpg', 1, 1)
INSERT INTO tb_section (title, description, position, img_uri, prerequisite_id, resource_id) VALUES ('Desafio do capítulo', 'implemente o que foi aprendido', 3, 'https://mir-s3-cdn-cf.behance.net/project_modules/disp/816f5d7636141.560aef70c492f.jpg', 1, 1)