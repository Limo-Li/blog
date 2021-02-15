package com.jackson.user.service.identity;

import com.jackson.user.orm.model.identity.UserRecord;

import java.util.List;

public interface IUserService {

    public List<UserRecord> queryList(int page, int size, String key);

    UserRecord save(UserRecord userRecord);

    public UserRecord queryUser(int userId);

    UserRecord update(UserRecord userRecord);

    int deleteUserRecord(int id);
}
