package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 区域疫情检查
 *
 * @author 
 * @email
 */
@TableName("quyujiancha")
public class QuyujianchaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QuyujianchaEntity() {

	}

	public QuyujianchaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 区域
     */
    @TableField(value = "yiqingquyu_id")

    private Integer yiqingquyuId;


    /**
     * 工作人员
     */
    @TableField(value = "gongzuorenyuan_id")

    private Integer gongzuorenyuanId;


    /**
     * 检查标题
     */
    @TableField(value = "quyujiancha_name")

    private String quyujianchaName;


    /**
     * 检查类型
     */
    @TableField(value = "quyujiancha_types")

    private Integer quyujianchaTypes;


    /**
     * 区域疫情检查详情
     */
    @TableField(value = "quyujiancha_content")

    private String quyujianchaContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：区域
	 */
    public Integer getYiqingquyuId() {
        return yiqingquyuId;
    }
    /**
	 * 获取：区域
	 */

    public void setYiqingquyuId(Integer yiqingquyuId) {
        this.yiqingquyuId = yiqingquyuId;
    }
    /**
	 * 设置：工作人员
	 */
    public Integer getGongzuorenyuanId() {
        return gongzuorenyuanId;
    }
    /**
	 * 获取：工作人员
	 */

    public void setGongzuorenyuanId(Integer gongzuorenyuanId) {
        this.gongzuorenyuanId = gongzuorenyuanId;
    }
    /**
	 * 设置：检查标题
	 */
    public String getQuyujianchaName() {
        return quyujianchaName;
    }
    /**
	 * 获取：检查标题
	 */

    public void setQuyujianchaName(String quyujianchaName) {
        this.quyujianchaName = quyujianchaName;
    }
    /**
	 * 设置：检查类型
	 */
    public Integer getQuyujianchaTypes() {
        return quyujianchaTypes;
    }
    /**
	 * 获取：检查类型
	 */

    public void setQuyujianchaTypes(Integer quyujianchaTypes) {
        this.quyujianchaTypes = quyujianchaTypes;
    }
    /**
	 * 设置：区域疫情检查详情
	 */
    public String getQuyujianchaContent() {
        return quyujianchaContent;
    }
    /**
	 * 获取：区域疫情检查详情
	 */

    public void setQuyujianchaContent(String quyujianchaContent) {
        this.quyujianchaContent = quyujianchaContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Quyujiancha{" +
            "id=" + id +
            ", yiqingquyuId=" + yiqingquyuId +
            ", gongzuorenyuanId=" + gongzuorenyuanId +
            ", quyujianchaName=" + quyujianchaName +
            ", quyujianchaTypes=" + quyujianchaTypes +
            ", quyujianchaContent=" + quyujianchaContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
