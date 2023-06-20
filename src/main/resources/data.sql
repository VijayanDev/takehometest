insert into USERS(id, username, password) values(10001,'ABC', '123');
insert into USERS(id, username, password) values(10002,'DEF', '456');
insert into USERS(id, username, password) values(10003,'GHI', '787');

insert into ROLES(id, name) values(1001,'System User');
insert into ROLES(id, name) values(1002,'Supervisor');
insert into ROLES(id, name) values(1003,'Regular User');

insert into PRIVILEGES(id, name) values(101,'View Only');
insert into PRIVILEGES(id, name) values(102,'Data Entry');
insert into PRIVILEGES(id, name) values(103,'Review Entry');
insert into PRIVILEGES(id, name) values(104,'create user');

insert into USER_ROLES(user_id, role_id) values(10001,1001);
insert into USER_ROLES(user_id, role_id) values(10001,1002);
insert into USER_ROLES(user_id, role_id) values(10002,1002);
insert into USER_ROLES(user_id, role_id) values(10003,1003);

insert into ROLE_PRIVILEGES(role_id, privilege_id) values(1001,101);
insert into ROLE_PRIVILEGES(role_id, privilege_id) values(1001,104);
insert into ROLE_PRIVILEGES(role_id, privilege_id) values(1002,102);
insert into ROLE_PRIVILEGES(role_id, privilege_id) values(1002,103);
insert into ROLE_PRIVILEGES(role_id, privilege_id) values(1003,102);