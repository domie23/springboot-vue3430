package com.dao;

import com.entity.QuyujianchaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QuyujianchaView;

/**
 * 区域疫情检查 Dao 接口
 *
 * @author 
 */
public interface QuyujianchaDao extends BaseMapper<QuyujianchaEntity> {

   List<QuyujianchaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
