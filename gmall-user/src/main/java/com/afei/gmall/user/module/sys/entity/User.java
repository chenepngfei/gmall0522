package com.afei.gmall.user.module.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("sys_user")
public class User {
    @TableId
    private  Long id;
    private  String userName;
    private  String password;
    private Date crTime;
}
