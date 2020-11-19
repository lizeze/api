package com.github.xiaotaideng.api.sys.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zeze.li
 * @BelongsProject: com.github.xiaotaideng.api.sys.model
 * @date 2020/11/18 14:42
 */
@Getter
@Setter
@TableName("sys_user")
public class UserDO {

    @TableId
    @TableField("user_id")
    private String userId;

    @TableField("user_name")
    private String userName;

    @TableField("user_login_name")
    private String userLoginName;

    @TableField("user_pwd")
    private String userPwd;

    @TableField("user_status")
    private Integer userStaus;


}
