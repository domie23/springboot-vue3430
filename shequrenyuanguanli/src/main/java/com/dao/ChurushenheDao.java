package com.dao;

import com.entity.ChurushenheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChurushenheView;

/**
 * 出入申请 Dao 接口
 *
 * @author 
 */
public interface ChurushenheDao extends BaseMapper<ChurushenheEntity> {

   List<ChurushenheView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
