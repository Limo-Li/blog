package com.jackson.user.orm.mapper.identity;

import com.jackson.user.orm.model.identity.UserDailyRecord;
import com.jackson.user.orm.model.identity.UserDailyRecordExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDailyRecordMapper {
    int countByExample(UserDailyRecordExample example);

    int deleteByExample(UserDailyRecordExample example);

    int insert(UserDailyRecord record);

    int insertSelective(UserDailyRecord record);

    List<UserDailyRecord> selectByExample(UserDailyRecordExample example);

    int updateByExampleSelective(@Param("record") UserDailyRecord record, @Param("example") UserDailyRecordExample example);

    int updateByExample(@Param("record") UserDailyRecord record, @Param("example") UserDailyRecordExample example);
}