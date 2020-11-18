package com.github.xiaotaideng.api.sys.controller;

import com.github.xiaotaideng.api.mapper.UserMapper;
import com.github.xiaotaideng.api.sys.model.UserDO;
import com.github.xiaotaideng.api.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zeze.li
 * @BelongsProject: com.github.xiaotaideng.api.sys.controller
 * @date 2020/11/18 14:44
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<UserDO> getList() {
        return userService.list();
    }


}
