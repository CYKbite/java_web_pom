package com.situ.mall.pojo.query;

import lombok.Data;

@Data

public class AdminQuery {
    // 第几页
    private Integer page;

    // 每页几条
    private Integer limit;

    private String name;

    private String email;
}
