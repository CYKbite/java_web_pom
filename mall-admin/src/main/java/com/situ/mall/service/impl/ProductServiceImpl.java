package com.situ.mall.service.impl;

import com.situ.mall.pojo.entity.Product;
import com.situ.mall.mapper.ProductMapper;
import com.situ.mall.service.IProductService;
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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
