package com.situ.mall.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

@RequestMapping("admin/list")
    public String  ToAdminList(){
        return "admin_list";
    }
}
