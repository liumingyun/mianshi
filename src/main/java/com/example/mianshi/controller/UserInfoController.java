package com.example.mianshi.controller;

import com.example.mianshi.bean.UserInfo;
import com.example.mianshi.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author liumingyun
 * @description 用户信息控制层
 * @date 2020/3/514:11
 */
@Api(tags = "测试接口")
@RestController
@RequestMapping(value = "/tests")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;


    /**
     * 查詢所有用戶信息
     * @return
     */
    @ApiOperation("获取所有的用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "当前页", required = true, paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "一页显示多少行", required = false, paramType = "query")
    })
    @GetMapping
    public List<UserInfo> getAll(@RequestParam("pageIndex")Integer pageIndex,@RequestParam("pageSize") Integer pageSize){
        return  userInfoService.getUserInfo(pageIndex,pageSize);
    }

    /**
     * 增加一條用戶信息
     */
    @ApiOperation("增加一條用戶信息")
    @PostMapping
    public  void addUserInfo(@RequestBody  UserInfo userInfo){
        userInfoService.addUserInfo(userInfo);
    }

    /**
     * 刪除一條用戶數據
     */
    @ApiOperation("刪除一條用戶數據")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "ID", required = true, paramType = "query")
    })
    @DeleteMapping
    public void  delUserInfo(@RequestParam("id") String id){
        userInfoService.deleteUserInfo(id);
    }


    /**
     *修改一條數據
     */

    @ApiOperation("修改一條數據")
    @PutMapping
    public void  updateUserInfo(@RequestBody  UserInfo userInfo){
        userInfoService.updateUserInfo(userInfo);
    }








}
