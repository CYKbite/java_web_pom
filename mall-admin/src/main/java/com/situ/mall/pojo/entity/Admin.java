package com.situ.mall.pojo.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author CYK
 * @since 2026-06-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("`admin`")
// MyBatis-Plus 自动生成 SQL 时，默认根据 POJO 类名推断数据库表名；
// 如果实体类上写了 @TableName 注解，就会优先使用 @TableName 指定的表名，而不是继续按类名推断。
public class Admin implements Serializable {


    /**
     * 用户表id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户密码，MD5加密
     */
    private String password;

    /**
     * 头像
     */
    private String avatar;

    private String email;

    private String phone;

    /**
     * 角色0-管理员,1-普通用户
     */
    private Integer role;

    /**
     * 状态（1：正常 0：停用）
     */
    private Integer status;

    /**
     * 逻辑删除 1 表示删除，0 表示未删除
     */
    @TableLogic
    private Integer deleted;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


}
