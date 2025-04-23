package com.entity.model;

import com.entity.QuyujianchaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 区域疫情检查
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QuyujianchaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 区域
     */
    private Integer yiqingquyuId;


    /**
     * 工作人员
     */
    private Integer gongzuorenyuanId;


    /**
     * 检查标题
     */
    private String quyujianchaName;


    /**
     * 检查类型
     */
    private Integer quyujianchaTypes;


    /**
     * 区域疫情检查详情
     */
    private String quyujianchaContent;


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
	 * 获取：区域
	 */
    public Integer getYiqingquyuId() {
        return yiqingquyuId;
    }


    /**
	 * 设置：区域
	 */
    public void setYiqingquyuId(Integer yiqingquyuId) {
        this.yiqingquyuId = yiqingquyuId;
    }
    /**
	 * 获取：工作人员
	 */
    public Integer getGongzuorenyuanId() {
        return gongzuorenyuanId;
    }


    /**
	 * 设置：工作人员
	 */
    public void setGongzuorenyuanId(Integer gongzuorenyuanId) {
        this.gongzuorenyuanId = gongzuorenyuanId;
    }
    /**
	 * 获取：检查标题
	 */
    public String getQuyujianchaName() {
        return quyujianchaName;
    }


    /**
	 * 设置：检查标题
	 */
    public void setQuyujianchaName(String quyujianchaName) {
        this.quyujianchaName = quyujianchaName;
    }
    /**
	 * 获取：检查类型
	 */
    public Integer getQuyujianchaTypes() {
        return quyujianchaTypes;
    }


    /**
	 * 设置：检查类型
	 */
    public void setQuyujianchaTypes(Integer quyujianchaTypes) {
        this.quyujianchaTypes = quyujianchaTypes;
    }
    /**
	 * 获取：区域疫情检查详情
	 */
    public String getQuyujianchaContent() {
        return quyujianchaContent;
    }


    /**
	 * 设置：区域疫情检查详情
	 */
    public void setQuyujianchaContent(String quyujianchaContent) {
        this.quyujianchaContent = quyujianchaContent;
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
