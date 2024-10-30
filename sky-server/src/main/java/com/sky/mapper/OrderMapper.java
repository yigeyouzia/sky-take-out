package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author cyt
 * @date 2024/10/30 14:34
 */

@Mapper
public interface OrderMapper {

    /**
     * 插入订单
     *
     * @param order
     */
    void insert(Orders order);
}
