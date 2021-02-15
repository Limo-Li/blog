package com.jackson.user.orm.mapper.identity;

import com.jackson.user.orm.model.identity.ProjectRecord;
import com.jackson.user.orm.model.identity.ProjectRecordExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface ProjectRecordMapper {
    int countByExample(ProjectRecordExample example);

    int deleteByExample(ProjectRecordExample example);

    int deleteByPrimaryKey(Integer projectId);

    int insert(ProjectRecord record);

    int insertSelective(ProjectRecord record);

    List<ProjectRecord> selectByExample(ProjectRecordExample example);

    ProjectRecord selectByPrimaryKey(Integer projectId);

    int updateByExampleSelective(@Param("record") ProjectRecord record, @Param("example") ProjectRecordExample example);

    int updateByExample(@Param("record") ProjectRecord record, @Param("example") ProjectRecordExample example);

    int updateByPrimaryKeySelective(ProjectRecord record);

    int updateByPrimaryKey(ProjectRecord record);
}