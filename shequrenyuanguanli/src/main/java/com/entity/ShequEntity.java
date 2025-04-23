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
 * 社区信息
 *
 * @author 
 * @email
 */
@TableName("shequ")
public class ShequEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShequEntity() {

	}

	public ShequEntity(T t) {
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
     * 社区名称
     */
    @TableField(value = "shequ_name")

    private String shequName;


    /**
     * 社区类型
     */
    @TableField(value = "shequ_types")

    private Integer shequTypes;


    /**
     * 社区详情
     */
    @TableField(value = "shequ_content")

    private String shequContent;


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
	 * 设置：社区名称
	 */
    public String getShequName() {
        return shequName;
    }
    /**
	 * 获取：社区名称
	 */

    public void setShequName(String shequName) {
        this.shequName = shequName;
    }
    /**
	 * 设置：社区类型
	 */
    public Integer getShequTypes() {
        return shequTypes;
    }
    /**
	 * 获取：社区类型
	 */

    public void setShequTypes(Integer shequTypes) {
        this.shequTypes = shequTypes;
    }
    /**
	 * 设置：社区详情
	 */
    public String getShequContent() {
        return shequContent;
    }
    /**
	 * 获取：社区详情
	 */

    public void setShequContent(String shequContent) {
        this.shequContent = shequContent;
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
        return "Shequ{" +
            "id=" + id +
            ", shequName=" + shequName +
            ", shequTypes=" + shequTypes +
            ", shequContent=" + shequContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
