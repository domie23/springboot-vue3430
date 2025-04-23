package com.entity.model;

import com.entity.YiqingquyuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 疫情区域信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YiqingquyuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 疫情区域名称
     */
    private String yiqingquyuName;


    /**
     * 疫情区域类型
     */
    private Integer yiqingquyuTypes;


    /**
     * 疫情区域详情
     */
    private String yiqingquyuContent;


    /**
     * 添加时间
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
	 * 获取：疫情区域名称
	 */
    public String getYiqingquyuName() {
        return yiqingquyuName;
    }


    /**
	 * 设置：疫情区域名称
	 */
    public void setYiqingquyuName(String yiqingquyuName) {
        this.yiqingquyuName = yiqingquyuName;
    }
    /**
	 * 获取：疫情区域类型
	 */
    public Integer getYiqingquyuTypes() {
        return yiqingquyuTypes;
    }


    /**
	 * 设置：疫情区域类型
	 */
    public void setYiqingquyuTypes(Integer yiqingquyuTypes) {
        this.yiqingquyuTypes = yiqingquyuTypes;
    }
    /**
	 * 获取：疫情区域详情
	 */
    public String getYiqingquyuContent() {
        return yiqingquyuContent;
    }


    /**
	 * 设置：疫情区域详情
	 */
    public void setYiqingquyuContent(String yiqingquyuContent) {
        this.yiqingquyuContent = yiqingquyuContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
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
