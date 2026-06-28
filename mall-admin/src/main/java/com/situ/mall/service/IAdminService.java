package com.situ.mall.service;

import com.situ.mall.pojo.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.situ.mall.pojo.query.AdminQuery;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author CYK
 * @since 2026-06-28
 */
public interface IAdminService extends IService<Admin> {
    List<Admin> list(AdminQuery adminQuery);
}
