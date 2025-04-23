package com.dao;

import com.entity.ShequEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequView;

/**
 * 社区信息 Dao 接口
 *
 * @author 
 */
public interface ShequDao extends BaseMapper<ShequEntity> {

   List<ShequView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
