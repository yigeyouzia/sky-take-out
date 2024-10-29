package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.ArrayList;
import java.util.List;

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


    /**
     * 菜品分页查询
     *
     * @param dishPageQueryDTO
     * @return
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    void deleteBatch(List<Long> ids);

    /**
     * 根据id查询菜品
     *
     * @param id
     * @return
     */
    DishVO getByIdWithFlavor(Long id);

    void updateWithFlavor(DishDTO dishDTO);

    /**
     * 条件查询菜品和口味
     * @param dish
     * @return
     */
    List<DishVO> listWithFlavor(Dish dish);

    ArrayList<Dish> getDishByCategoryId(Long categoryId);
}
