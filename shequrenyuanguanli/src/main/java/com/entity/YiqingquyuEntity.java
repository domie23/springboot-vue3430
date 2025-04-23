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
 * 疫情区域信息
 *
 * @author 
 * @email
 */
@TableName("yiqingquyu")
public class YiqingquyuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YiqingquyuEntity() {

	}

	public YiqingquyuEntity(T t) {
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
     * 疫情区域名称
     */
    @TableField(value = "yiqingquyu_name")

    private String yiqingquyuName;


    /**
     * 疫情区域类型
     */
    @TableField(value = "yiqingquyu_types")

    private Integer yiqingquyuTypes;


    /**
     * 疫情区域详情
     */
    @TableField(value = "yiqingquyu_content")

    private String yiqingquyuContent;


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
	 * 设置：疫情区域名称
	 */
    public String getYiqingquyuName() {
        return yiqingquyuName;
    }
    /**
	 * 获取：疫情区域名称
	 */

    public void setYiqingquyuName(String yiqingquyuName) {
        this.yiqingquyuName = yiqingquyuName;
    }
    /**
	 * 设置：疫情区域类型
	 */
    public Integer getYiqingquyuTypes() {
        return yiqingquyuTypes;
    }
    /**
	 * 获取：疫情区域类型
	 */

    public void setYiqingquyuTypes(Integer yiqingquyuTypes) {
        this.yiqingquyuTypes = yiqingquyuTypes;
    }
    /**
	 * 设置：疫情区域详情
	 */
    public String getYiqingquyuContent() {
        return yiqingquyuContent;
    }
    /**
	 * 获取：疫情区域详情
	 */

    public void setYiqingquyuContent(String yiqingquyuContent) {
        this.yiqingquyuContent = yiqingquyuContent;
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
        return "Yiqingquyu{" +
            "id=" + id +
            ", yiqingquyuName=" + yiqingquyuName +
            ", yiqingquyuTypes=" + yiqingquyuTypes +
            ", yiqingquyuContent=" + yiqingquyuContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
