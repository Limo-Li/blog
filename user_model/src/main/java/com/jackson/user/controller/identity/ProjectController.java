package com.jackson.user.controller.identity;

import com.jackson.user.orm.model.identity.ProjectRecord;
import com.jackson.user.service.identity.IProjectService;
import com.jackson.user.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private IProjectService projectServiceImpl;

    @RequestMapping(value = "project", method = RequestMethod.POST)
    public ResultUtil save(@RequestBody ProjectRecord projectRecord){
        projectRecord = projectServiceImpl.save(projectRecord);
        return new ResultUtil(HttpStatus.OK, projectRecord);
    }

    @RequestMapping(value = "project", method = RequestMethod.PUT)
    public ResultUtil update(@RequestBody ProjectRecord projectRecord){
        projectRecord = projectServiceImpl.update(projectRecord);
        return new ResultUtil(HttpStatus.OK, projectRecord);
    }

    @RequestMapping(value = "project/{projectId}", method = RequestMethod.DELETE)
    public ResultUtil detele(@PathVariable int projectId){
        int result = projectServiceImpl.delete(projectId);
        return new ResultUtil(HttpStatus.OK, result);
    }

    @RequestMapping(value = "project/{id}", method = RequestMethod.GET)
    public ResultUtil query(@PathVariable int id){
        ProjectRecord projectRecord = projectServiceImpl.query(id);
        return new ResultUtil(HttpStatus.OK, projectRecord);
    }


    @RequestMapping(value = "project", method = RequestMethod.GET)
    public ResultUtil queryList(@RequestParam int page,
                                @RequestParam int size,
                                @RequestParam String key){
        List<ProjectRecord> list = projectServiceImpl.queryList(page, size, key);
        return new ResultUtil(HttpStatus.OK, list);
    }
}
