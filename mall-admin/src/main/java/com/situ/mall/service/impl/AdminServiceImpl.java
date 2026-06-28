package com.situ.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.situ.mall.pojo.entity.Admin;
import com.situ.mall.mapper.AdminMapper;
import com.situ.mall.pojo.query.AdminQuery;
import com.situ.mall.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.situ.mall.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

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

    public PageResult<Admin> list(AdminQuery adminQuery){
        //开启分页（创建一个分页对象，表示查询第2页，每页10条）
        IPage<Admin> page = new Page<>(adminQuery.getPage(),adminQuery.getLimit());
        //查询分页（调用 MyBatis-Plus 提供的分页方法
        //第一个参数：分页对象 page
        //第二个参数：查询条件（null 表示无条件，查询全部）
        //底层生成的 SQL
        // 查询结果会自动填充到 page 对象中）
        QueryWrapper<Admin> querywrapper = new QueryWrapper<>();
        if(!ObjectUtils.isEmpty(adminQuery.getName())){
            querywrapper.like("name",adminQuery.getName());
        }

        if(!ObjectUtils.isEmpty(adminQuery.getEmail())){
            querywrapper.like("email",adminQuery.getEmail());
        }

        IPage<Admin> result = adminMapper.selectPage(page,querywrapper );
        //获取分页数据
        List<Admin> list = result.getRecords();

        long total = result.getTotal();

        return new PageResult<>(0,"成功",(int)total,list);
    }

}
//extends ServiceImpl<AdminMapper, Admin>继承的父类有方法，可以实现简单增删改查，不用自己写简单方法