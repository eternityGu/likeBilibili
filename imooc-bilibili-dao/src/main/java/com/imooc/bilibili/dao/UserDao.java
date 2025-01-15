package com.imooc.bilibili.dao;

import com.imooc.bilibili.domain.User;
import com.imooc.bilibili.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

@Mapper
public interface UserDao {

    User getUserByPhone(String phone);

    Integer addUser(User user);

    Integer addUserInfo(UserInfo userInfo);

    User getUserById(Long id);

    UserInfo getUserInfoByUserId(Long userId);

    Integer updateUser(User user);

    User getUserByPhoneOrEmail(String phone);

    Integer updateUserInfos(UserInfo userInfo);

    List<UserInfo> getUserInfoByUserIds(Set<Long> userIdList);
}
