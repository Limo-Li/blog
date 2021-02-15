package com.jackson.user.orm.mapper.identity;

import com.jackson.user.orm.model.identity.UserRecord;
import com.jackson.user.orm.model.identity.UserRecordExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserRecordMapper {
    int countByExample(UserRecordExample example);

    int deleteByExample(UserRecordExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserRecord record);

    int insertSelective(UserRecord record);

    List<UserRecord> selectByExample(UserRecordExample example);

    UserRecord selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserRecord record, @Param("example") UserRecordExample example);

    int updateByExample(@Param("record") UserRecord record, @Param("example") UserRecordExample example);

    int updateByPrimaryKeySelective(UserRecord record);

    int updateByPrimaryKey(UserRecord record);

    List<UserRecord> selectByPage(UserRecordExample example);
}