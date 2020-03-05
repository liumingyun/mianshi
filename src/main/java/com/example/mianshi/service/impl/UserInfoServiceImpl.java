package com.example.mianshi.service.impl;

import com.example.mianshi.bean.UserInfo;
import com.example.mianshi.dao.UserInfoRepository;
import com.example.mianshi.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liumingyun
 * @description 业务操作接口实现类
 * @date 2020/3/515:16
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {


    @Autowired
    private UserInfoRepository repository;


    @Override
    public void addUserInfo(UserInfo userInfo) {
        repository.insertUserInfo(userInfo.getUsername(),userInfo.getPassword(),userInfo.getEmail());
    }

    @Override
    public void deleteUserInfo(String id) {
        repository.deleteUserInfoById(id);
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        repository.updateUserInfoById(userInfo.getId(),userInfo.getUsername(),userInfo.getPassword(),userInfo.getEmail());
    }

    @Override
    public List<UserInfo> getUserInfo(Integer pageIndex,Integer pageSize) {
        Integer currentNo=(pageIndex-1)*pageSize;
        return repository.selectAllUserInfo(currentNo,pageSize);
    }





    @Override
    public int getCountUserInfo() {
        return repository.getCountUserInfo();
    }
}
