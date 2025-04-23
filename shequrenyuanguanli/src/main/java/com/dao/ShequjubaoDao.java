package com.dao;

import com.entity.ShequjubaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequjubaoView;

/**
 * 社区举报 Dao 接口
 *
 * @author 
 */
public interface ShequjubaoDao extends BaseMapper<ShequjubaoEntity> {

   List<ShequjubaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
