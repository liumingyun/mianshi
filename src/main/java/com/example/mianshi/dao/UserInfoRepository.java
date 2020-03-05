package com.example.mianshi.dao;

import com.example.mianshi.bean.UserInfo;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * @author liumingyun
 * @description TOOD
 * @date 2020/3/514:13
 */
@SqlResource("userinfo")
public interface UserInfoRepository extends BaseMapper<UserInfo> {
    /**
     * 获取全部用户信息
     * @return
     */
    List<UserInfo> selectAllUserInfo(Integer pageIndex,Integer pageSize);

    /**
     * 增加一条记录到数据库
     */
    void insertUserInfo(String username,String password,String email);

    /**
     * 删除一条记录 根据id
     * @param id
     */
    void deleteUserInfoById(String id);

    /**
     * 修改一条记录 根据id
     */
    void updateUserInfoById(String id,String username,String password,String email);

    int getCountUserInfo();
}
