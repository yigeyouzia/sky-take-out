package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

/**
 * @author cyt
 * @date 2024/10/30 14:34
 */

@Mapper
public interface OrderDetailMapper {

    /**
     * 批量插入多条订单明细
     *
     * @param orderDetailList
     */
    void insertBatch(ArrayList<OrderDetail> orderDetailList);
}
