package com.jackson.user.service.identity;

import com.jackson.user.orm.model.identity.ProjectRecord;

import java.util.List;

public interface IProjectService {

    ProjectRecord save(ProjectRecord projectRecord);

    ProjectRecord update(ProjectRecord projectRecord);

    int delete(int projectId);

    List<ProjectRecord> queryList(int page, int size, String key);

    ProjectRecord query(int projectId);
}
