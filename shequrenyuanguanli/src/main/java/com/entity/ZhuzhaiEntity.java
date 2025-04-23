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
 * 住宅信息
 *
 * @author 
 * @email
 */
@TableName("zhuzhai")
public class ZhuzhaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhuzhaiEntity() {

	}

	public ZhuzhaiEntity(T t) {
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
     * 住宅地址
     */
    @TableField(value = "zhuzhai_name")

    private String zhuzhaiName;


    /**
     * 住宅类型
     */
    @TableField(value = "zhuzhai_types")

    private Integer zhuzhaiTypes;


    /**
     * 社区
     */
    @TableField(value = "shequ_id")

    private Integer shequId;


    /**
     * 住宅详情
     */
    @TableField(value = "zhuzhai_content")

    private String zhuzhaiContent;


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
	 * 设置：住宅地址
	 */
    public String getZhuzhaiName() {
        return zhuzhaiName;
    }
    /**
	 * 获取：住宅地址
	 */

    public void setZhuzhaiName(String zhuzhaiName) {
        this.zhuzhaiName = zhuzhaiName;
    }
    /**
	 * 设置：住宅类型
	 */
    public Integer getZhuzhaiTypes() {
        return zhuzhaiTypes;
    }
    /**
	 * 获取：住宅类型
	 */

    public void setZhuzhaiTypes(Integer zhuzhaiTypes) {
        this.zhuzhaiTypes = zhuzhaiTypes;
    }
    /**
	 * 设置：社区
	 */
    public Integer getShequId() {
        return shequId;
    }
    /**
	 * 获取：社区
	 */

    public void setShequId(Integer shequId) {
        this.shequId = shequId;
    }
    /**
	 * 设置：住宅详情
	 */
    public String getZhuzhaiContent() {
        return zhuzhaiContent;
    }
    /**
	 * 获取：住宅详情
	 */

    public void setZhuzhaiContent(String zhuzhaiContent) {
        this.zhuzhaiContent = zhuzhaiContent;
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
        return "Zhuzhai{" +
            "id=" + id +
            ", zhuzhaiName=" + zhuzhaiName +
            ", zhuzhaiTypes=" + zhuzhaiTypes +
            ", shequId=" + shequId +
            ", zhuzhaiContent=" + zhuzhaiContent +
            ", createTime=" + createTime +
        "}";
    }
}
