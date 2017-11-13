INSERT INTO user(user_id, name) VALUES ('user1', 'Jack');
INSERT INTO user(user_id, name) VALUES ('user2', 'Sally');

INSERT INTO role(role_id) VALUES ('admin');
INSERT INTO role(role_id) VALUES ('user');
INSERT INTO role(role_id) VALUES ('operator');

INSERT INTO user_role(user_id, role_id) VALUES ('user1', 'admin');
INSERT INTO user_role(user_id, role_id) VALUES ('user1', 'user');
INSERT INTO user_role(user_id, role_id) VALUES ('user2', 'operator');
