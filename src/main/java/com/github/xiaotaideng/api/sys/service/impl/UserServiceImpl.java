package com.github.xiaotaideng.api.sys.service.impl;

import com.github.xiaotaideng.api.core.base.BaseService;
import com.github.xiaotaideng.api.core.base.BaseServiceImpl;
import com.github.xiaotaideng.api.mapper.UserMapper;
import com.github.xiaotaideng.api.sys.model.UserDO;
import com.github.xiaotaideng.api.sys.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author zeze.li
 * @BelongsProject: com.github.xiaotaideng.api.sys.service.impl
 * @date 2020/11/18 14:44
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, UserDO> implements UserService {
}
