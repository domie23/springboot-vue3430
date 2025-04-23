package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.YiqingquyuDao;
import com.entity.YiqingquyuEntity;
import com.service.YiqingquyuService;
import com.entity.view.YiqingquyuView;

/**
 * 疫情区域信息 服务实现类
 */
@Service("yiqingquyuService")
@Transactional
public class YiqingquyuServiceImpl extends ServiceImpl<YiqingquyuDao, YiqingquyuEntity> implements YiqingquyuService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<YiqingquyuView> page =new Query<YiqingquyuView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
