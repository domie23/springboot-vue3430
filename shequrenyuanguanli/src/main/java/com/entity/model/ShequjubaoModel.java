package com.entity.model;

import com.entity.ShequjubaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 社区举报
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShequjubaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 社区
     */
    private Integer shequId;


    /**
     * 举报标题
     */
    private String shequjubaoName;


    /**
     * 举报类型
     */
    private Integer shequjubaoTypes;


    /**
     * 举报详情
     */
    private String shequjubaoContent;


    /**
     * 举报时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：举报标题
	 */
    public String getShequjubaoName() {
        return shequjubaoName;
    }


    /**
	 * 设置：举报标题
	 */
    public void setShequjubaoName(String shequjubaoName) {
        this.shequjubaoName = shequjubaoName;
    }
    /**
	 * 获取：举报类型
	 */
    public Integer getShequjubaoTypes() {
        return shequjubaoTypes;
    }


    /**
	 * 设置：举报类型
	 */
    public void setShequjubaoTypes(Integer shequjubaoTypes) {
        this.shequjubaoTypes = shequjubaoTypes;
    }
    /**
	 * 获取：举报详情
	 */
    public String getShequjubaoContent() {
        return shequjubaoContent;
    }


    /**
	 * 设置：举报详情
	 */
    public void setShequjubaoContent(String shequjubaoContent) {
        this.shequjubaoContent = shequjubaoContent;
    }
    /**
	 * 获取：举报时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：举报时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
