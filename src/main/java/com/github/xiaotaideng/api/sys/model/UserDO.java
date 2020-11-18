package com.github.xiaotaideng.api.sys.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author zeze.li
 * @BelongsProject: com.github.xiaotaideng.api.sys.model
 * @date 2020/11/18 14:42
 */
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

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getUserStaus() {
        return userStaus;
    }

    public void setUserStaus(Integer userStaus) {
        this.userStaus = userStaus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
