selectAllUserInfo
===

select id,username,password,email from userinfo limit #pageIndex#,#pageSize#



insertUserInfo
===
insert into userinfo(username,password,email) values(#username#,#password#,#email#)

deleteUserInfoById
===
delete from  userinfo  where id =#id#


updateUserInfoById
===
update userinfo set username=#username#,password=#password#,email=#email# where id=#id#



getCountUserInfo
===
select count(id) from userinfo