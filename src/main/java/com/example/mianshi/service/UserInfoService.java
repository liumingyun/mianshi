package com.example.mianshi.service;

import com.example.mianshi.bean.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liumingyun
 * @description 业务操作接口
 * @date 2020/3/515:16
 */
@Service
public interface UserInfoService {

     void addUserInfo(UserInfo userInfo);

     void  deleteUserInfo(String id);

     void  updateUserInfo(UserInfo userInfo);

     List<UserInfo> getUserInfo(Integer pageIndex,Integer pageSize);

     int getCountUserInfo();




}
