package com.example.shop_online.mapper;

import com.example.shop_online.entity.UserShoppingCart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shop_online.vo.CartGoodsVO;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>

 */
public interface UserShoppingCartMapper extends BaseMapper<UserShoppingCart> {
    List<CartGoodsVO> getCartGoodsInfo(@Param("id") Integer id);
}