package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShequfenpeiEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 社区分配 服务类
 */
public interface ShequfenpeiService extends IService<ShequfenpeiEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}