package com.code.demo.miniapp.service;


import com.code.demo.miniapp.bean.UserInfo;
import com.code.demo.miniapp.dao.UserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    UserInfoDao userInfoDao;

    public UserInfo selectByOpenId(String open_id) {
//        userInfoDao.findByUsernameAndPassword();
        return null;
    }

    public void updateById(UserInfo user) {
    }

    public Boolean insert(UserInfo insert_user) {
        return null;
    }

}
