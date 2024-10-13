package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * @author cyt
 * @date 2024/10/13 15:30
 */
public interface DishService {

    /**
     * 新增菜品和对应口味
     *
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
