package com.situ.mall.service.impl;

import com.situ.mall.pojo.Order;
import com.situ.mall.mapper.OrderMapper;
import com.situ.mall.service.IOrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
