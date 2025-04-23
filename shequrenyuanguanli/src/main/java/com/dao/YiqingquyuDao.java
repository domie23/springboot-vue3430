package com.dao;

import com.entity.YiqingquyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YiqingquyuView;

/**
 * 疫情区域信息 Dao 接口
 *
 * @author 
 */
public interface YiqingquyuDao extends BaseMapper<YiqingquyuEntity> {

   List<YiqingquyuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
