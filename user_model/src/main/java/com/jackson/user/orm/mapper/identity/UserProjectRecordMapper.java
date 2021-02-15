package com.jackson.user.orm.mapper.identity;

import com.jackson.user.orm.model.identity.UserProjectRecord;
import com.jackson.user.orm.model.identity.UserProjectRecordExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserProjectRecordMapper {
    int countByExample(UserProjectRecordExample example);

    int deleteByExample(UserProjectRecordExample example);

    int deleteByPrimaryKey(Integer relationId);

    int insert(UserProjectRecord record);

    int insertSelective(UserProjectRecord record);

    List<UserProjectRecord> selectByExample(UserProjectRecordExample example);

    UserProjectRecord selectByPrimaryKey(Integer relationId);

    int updateByExampleSelective(@Param("record") UserProjectRecord record, @Param("example") UserProjectRecordExample example);

    int updateByExample(@Param("record") UserProjectRecord record, @Param("example") UserProjectRecordExample example);

    int updateByPrimaryKeySelective(UserProjectRecord record);

    int updateByPrimaryKey(UserProjectRecord record);
}