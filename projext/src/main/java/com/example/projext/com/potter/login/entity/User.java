package com.example.projext.com.potter.login.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("User")
public class User {
    private static final long serialVersionUID = 1L;

    @TableId(value = "UserID",type= IdType.ASSIGN_ID)
    private Integer id;

    @TableField("UserName") // 指定数据库字段
    private String username;

    @TableField("Phone") // 指定数据库字段
    private String phone;

    @TableField("Email") // 指定数据库字段
    private String email;


    @TableField("CreatedTime") // 指定数据库字段
    private String createTime;

}
