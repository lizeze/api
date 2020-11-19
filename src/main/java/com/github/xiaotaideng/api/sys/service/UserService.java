package com.github.xiaotaideng.api.sys.service;

import com.github.xiaotaideng.api.core.base.BaseService;
import com.github.xiaotaideng.api.sys.model.UserDO;

import java.util.List;

/**
 * @author zeze.li
 * @BelongsProject: com.github.xiaotaideng.api.sys.service
 * @date 2020/11/18 14:43
 */
public interface UserService extends BaseService<UserDO> {

    List<UserDO> userList(UserDO userDO);
}
