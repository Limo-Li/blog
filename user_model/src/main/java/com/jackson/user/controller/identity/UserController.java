package com.jackson.user.controller.identity;

import com.jackson.user.orm.model.identity.UserRecord;
import com.jackson.user.service.identity.IUserService;
import com.jackson.user.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService userServiceImpl;

    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    public ResultUtil query(@PathVariable int userId){
        UserRecord userRecord = userServiceImpl.queryUser(userId);
        return new ResultUtil(HttpStatus.OK, userRecord);
    }

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public ResultUtil queryList(@RequestParam int page,
                                @RequestParam int size,
                                @RequestParam String key){
        List<UserRecord> list = userServiceImpl.queryList(page, size, key);
        return new ResultUtil(HttpStatus.OK, list);
    }
    /**
     * 添加用户
     * @param userRecord
     * @return
     */
    @RequestMapping(value = "user", method = RequestMethod.POST)
    public ResultUtil save(@RequestBody UserRecord userRecord){
        userRecord = userServiceImpl.save(userRecord);
        return new ResultUtil(HttpStatus.OK, userRecord);
    }

    /**
     * 修改用户
     * @param userRecord
     * @return
     */
    @RequestMapping(value = "user", method = RequestMethod.PUT)
    public ResultUtil update(@RequestBody UserRecord userRecord){
        userRecord = userServiceImpl.update(userRecord);
        return new ResultUtil(HttpStatus.OK, userRecord);
    }

    /**
     * 删除用户
     * @param userId
     * @return
     */
    @RequestMapping(value = "/user/id", method = RequestMethod.DELETE)
    public ResultUtil detele(@PathVariable int userId) {
        int result = userServiceImpl.deleteUserRecord(userId);
        return null;
    }

}
