package com.entity.model;

import com.entity.ZhuzhaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 住宅信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhuzhaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 住宅地址
     */
    private String zhuzhaiName;


    /**
     * 住宅类型
     */
    private Integer zhuzhaiTypes;


    /**
     * 社区
     */
    private Integer shequId;


    /**
     * 住宅详情
     */
    private String zhuzhaiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：住宅地址
	 */
    public String getZhuzhaiName() {
        return zhuzhaiName;
    }


    /**
	 * 设置：住宅地址
	 */
    public void setZhuzhaiName(String zhuzhaiName) {
        this.zhuzhaiName = zhuzhaiName;
    }
    /**
	 * 获取：住宅类型
	 */
    public Integer getZhuzhaiTypes() {
        return zhuzhaiTypes;
    }


    /**
	 * 设置：住宅类型
	 */
    public void setZhuzhaiTypes(Integer zhuzhaiTypes) {
        this.zhuzhaiTypes = zhuzhaiTypes;
    }
    /**
	 * 获取：社区
	 */
    public Integer getShequId() {
        return shequId;
    }


    /**
	 * 设置：社区
	 */
    public void setShequId(Integer shequId) {
        this.shequId = shequId;
    }
    /**
	 * 获取：住宅详情
	 */
    public String getZhuzhaiContent() {
        return zhuzhaiContent;
    }


    /**
	 * 设置：住宅详情
	 */
    public void setZhuzhaiContent(String zhuzhaiContent) {
        this.zhuzhaiContent = zhuzhaiContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
