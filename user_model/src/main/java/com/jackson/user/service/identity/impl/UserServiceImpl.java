package com.jackson.user.service.identity.impl;

import com.jackson.user.orm.mapper.identity.UserRecordMapper;
import com.jackson.user.orm.model.identity.UserRecord;
import com.jackson.user.service.identity.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRecordMapper userRecordMapper;

    public List<UserRecord> queryList(int page, int size, String key) {
        return null;
    }

    public UserRecord save(UserRecord userRecord) {
        int result = userRecordMapper.insertSelective(userRecord);
        return userRecord;
    }

    public UserRecord queryUser(int userId) {
        return userRecordMapper.selectByPrimaryKey(userId);
    }

    public List<UserRecord> queryUser(int page, int size, String key) {
        if (0 != page || 0 != size) {

        } else {

        }

        return null;
    }

    public UserRecord update(UserRecord userRecord) {
        int result = userRecordMapper.updateByPrimaryKey(userRecord);
        return userRecord;
    }

    public int deleteUserRecord(int userId) {
        return userRecordMapper.deleteByPrimaryKey(userId);
    }
}
