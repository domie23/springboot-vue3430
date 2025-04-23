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
import com.dao.ShequjubaoDao;
import com.entity.ShequjubaoEntity;
import com.service.ShequjubaoService;
import com.entity.view.ShequjubaoView;

/**
 * 社区举报 服务实现类
 */
@Service("shequjubaoService")
@Transactional
public class ShequjubaoServiceImpl extends ServiceImpl<ShequjubaoDao, ShequjubaoEntity> implements ShequjubaoService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ShequjubaoView> page =new Query<ShequjubaoView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
