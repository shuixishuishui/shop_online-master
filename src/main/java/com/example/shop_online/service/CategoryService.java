package com.example.shop_online.service;

import com.example.shop_online.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.shop_online.vo.CategoryVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *

 */
public interface CategoryService extends IService<Category> {
    List<Category> getIndexCategoryList();
    List<CategoryVO> getCategoryList();
}
