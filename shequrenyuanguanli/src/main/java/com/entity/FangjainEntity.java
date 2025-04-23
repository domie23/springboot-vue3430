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
 * 房间信息
 *
 * @author 
 * @email
 */
@TableName("fangjain")
public class FangjainEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FangjainEntity() {

	}

	public FangjainEntity(T t) {
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
     * 房间地址
     */
    @TableField(value = "fangjain_name")

    private String fangjainName;


    /**
     * 房间类型
     */
    @TableField(value = "fangjain_types")

    private Integer fangjainTypes;


    /**
     * 住宅
     */
    @TableField(value = "zhuzhai_id")

    private Integer zhuzhaiId;


    /**
     * 房间详情
     */
    @TableField(value = "fangjain_content")

    private String fangjainContent;


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
	 * 设置：房间地址
	 */
    public String getFangjainName() {
        return fangjainName;
    }
    /**
	 * 获取：房间地址
	 */

    public void setFangjainName(String fangjainName) {
        this.fangjainName = fangjainName;
    }
    /**
	 * 设置：房间类型
	 */
    public Integer getFangjainTypes() {
        return fangjainTypes;
    }
    /**
	 * 获取：房间类型
	 */

    public void setFangjainTypes(Integer fangjainTypes) {
        this.fangjainTypes = fangjainTypes;
    }
    /**
	 * 设置：住宅
	 */
    public Integer getZhuzhaiId() {
        return zhuzhaiId;
    }
    /**
	 * 获取：住宅
	 */

    public void setZhuzhaiId(Integer zhuzhaiId) {
        this.zhuzhaiId = zhuzhaiId;
    }
    /**
	 * 设置：房间详情
	 */
    public String getFangjainContent() {
        return fangjainContent;
    }
    /**
	 * 获取：房间详情
	 */

    public void setFangjainContent(String fangjainContent) {
        this.fangjainContent = fangjainContent;
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
        return "Fangjain{" +
            "id=" + id +
            ", fangjainName=" + fangjainName +
            ", fangjainTypes=" + fangjainTypes +
            ", zhuzhaiId=" + zhuzhaiId +
            ", fangjainContent=" + fangjainContent +
            ", createTime=" + createTime +
        "}";
    }
}
