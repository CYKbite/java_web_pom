package com.situ.mall.service.impl;

import com.situ.mall.pojo.entity.Admin;
import com.situ.mall.mapper.AdminMapper;
import com.situ.mall.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author CYK
 * @since 2026-06-28
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {


}
//extends ServiceImpl<AdminMapper, Admin>继承的父类有方法，可以实现简单增删改查，不用自己写简单方法