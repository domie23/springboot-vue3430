package com.entity.model;

import com.entity.FangjainEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 房间信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FangjainModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 房间地址
     */
    private String fangjainName;


    /**
     * 房间类型
     */
    private Integer fangjainTypes;


    /**
     * 住宅
     */
    private Integer zhuzhaiId;


    /**
     * 房间详情
     */
    private String fangjainContent;


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
	 * 获取：房间地址
	 */
    public String getFangjainName() {
        return fangjainName;
    }


    /**
	 * 设置：房间地址
	 */
    public void setFangjainName(String fangjainName) {
        this.fangjainName = fangjainName;
    }
    /**
	 * 获取：房间类型
	 */
    public Integer getFangjainTypes() {
        return fangjainTypes;
    }


    /**
	 * 设置：房间类型
	 */
    public void setFangjainTypes(Integer fangjainTypes) {
        this.fangjainTypes = fangjainTypes;
    }
    /**
	 * 获取：住宅
	 */
    public Integer getZhuzhaiId() {
        return zhuzhaiId;
    }


    /**
	 * 设置：住宅
	 */
    public void setZhuzhaiId(Integer zhuzhaiId) {
        this.zhuzhaiId = zhuzhaiId;
    }
    /**
	 * 获取：房间详情
	 */
    public String getFangjainContent() {
        return fangjainContent;
    }


    /**
	 * 设置：房间详情
	 */
    public void setFangjainContent(String fangjainContent) {
        this.fangjainContent = fangjainContent;
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
