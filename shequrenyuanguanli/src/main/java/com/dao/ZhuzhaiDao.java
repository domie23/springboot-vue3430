package com.dao;

import com.entity.ZhuzhaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuzhaiView;

/**
 * 住宅信息 Dao 接口
 *
 * @author 
 */
public interface ZhuzhaiDao extends BaseMapper<ZhuzhaiEntity> {

   List<ZhuzhaiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
