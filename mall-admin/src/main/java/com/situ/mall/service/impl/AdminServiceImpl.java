package com.situ.mall.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.situ.mall.pojo.entity.Admin;
import com.situ.mall.mapper.AdminMapper;
import com.situ.mall.pojo.query.AdminQuery;
import com.situ.mall.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    @Autowired
    private AdminMapper adminMapper;

    public List<Admin> list(AdminQuery adminQuery){
        //开启分页
        IPage<Admin> page = new Page<>(adminQuery.getPage(),adminQuery.getLimit());
        //查询分页
        adminMapper.selectPage(page,null);
        //获取分页数据
        List<Admin> list = page.getRecords();

        return list;
    }

}
//extends ServiceImpl<AdminMapper, Admin>继承的父类有方法，可以实现简单增删改查，不用自己写简单方法