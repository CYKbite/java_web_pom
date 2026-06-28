package com.situ.mall.controller;


import com.situ.mall.pojo.entity.Admin;
import com.situ.mall.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author CYK
 * @since 2026-06-28
 */
@RestController //RestController = Controller + ResponseBody 能标识controller并直接返回json数据
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private IAdminService iadminService;
    @RequestMapping("/select")
    public List<Admin> selectall(){
        return iadminService.list();
    }
}

