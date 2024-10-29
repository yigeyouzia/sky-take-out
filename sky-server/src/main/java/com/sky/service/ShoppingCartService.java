package com.sky.service;

import com.sky.dto.ShoppingCartDTO;

/**
 * @author cyt
 * @date 2024/10/29 17:41
 */
public interface ShoppingCartService {
    /**
     * 添加购物车
     *
     * @param shoppingCartDTO
     * @return
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
