package com.jackson.user.service.identity.impl;

import com.jackson.user.orm.mapper.identity.ProjectRecordMapper;
import com.jackson.user.orm.model.identity.ProjectRecord;
import com.jackson.user.service.identity.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements IProjectService {

    @Autowired
    private ProjectRecordMapper projectRecordMapper;

    public ProjectRecord save(ProjectRecord projectRecord) {
        int result = projectRecordMapper.insertSelective(projectRecord);
        return projectRecord;
    }

    public ProjectRecord update(ProjectRecord projectRecord) {
        int result = projectRecordMapper.updateByPrimaryKey(projectRecord);
        return projectRecord;
    }

    public int delete(int projectId) {
        return projectRecordMapper.deleteByPrimaryKey(projectId);
    }

    public List<ProjectRecord> queryList(int page, int size, String key) {

        return null;
    }

    public ProjectRecord query(int projectId) {
        ProjectRecord projectRecord = projectRecordMapper.selectByPrimaryKey(projectId);
        return projectRecord;
    }
}
