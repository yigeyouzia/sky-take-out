package com.sky.mapper;

import com.sky.entity.ShoppingCart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author cyt
 * @date 2024/10/29 18:19
 */
@Mapper
public interface ShoppingCartMapper {
    List<ShoppingCart> list(ShoppingCart shoppingCart);


    @Update("update shopping_cart set number = #{number} where id = #{id} ")
    void updateNumberById(ShoppingCart shoppingCart);

    /**
     * 插入购物车数据
     *
     * @param shoppingCart
     */
    @Insert("insert into shopping_cart (name, user_id, dish_id, setmeal_id, dish_flavor, number, amount, image, create_time) " +
            " values (#{name},#{userId},#{dishId},#{setmealId},#{dishFlavor},#{number},#{amount},#{image},#{createTime})")
    void insert(ShoppingCart shoppingCart);

    /**
     * 根据id删除购物车数据
     *
     * @param id
     */
    @Delete("delete from shopping_cart where id = #{id}")
    void deleteById(Long id);

    /**
     * 清空购物车
     *
     * @param userId
     */
    @Delete("delete  from  shopping_cart where user_id = #{userId}")
    void deleteByUserId(Long userId);
}
