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
 * 出入申请
 *
 * @author 
 * @email
 */
@TableName("churushenhe")
public class ChurushenheEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChurushenheEntity() {

	}

	public ChurushenheEntity(T t) {
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
     * 居民
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 出入类型
     */
    @TableField(value = "churushenhe_types")

    private Integer churushenheTypes;


    /**
     * 居民体温
     */
    @TableField(value = "churushenhe_tiwen")

    private Double churushenheTiwen;


    /**
     * 申请材料
     */
    @TableField(value = "churushenhe_file")

    private String churushenheFile;


    /**
     * 出入日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "churushenhe_time")

    private Date churushenheTime;


    /**
     * 备注
     */
    @TableField(value = "churushenhe_text")

    private String churushenheText;


    /**
     * 申请状态
     */
    @TableField(value = "churushenhe_yesno_types")

    private Integer churushenheYesnoTypes;


    /**
     * 申请结果
     */
    @TableField(value = "churushenhe_yesno_text")

    private String churushenheYesnoText;


    /**
     * 添加日期
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
	 * 设置：居民
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：居民
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：出入类型
	 */
    public Integer getChurushenheTypes() {
        return churushenheTypes;
    }
    /**
	 * 获取：出入类型
	 */

    public void setChurushenheTypes(Integer churushenheTypes) {
        this.churushenheTypes = churushenheTypes;
    }
    /**
	 * 设置：居民体温
	 */
    public Double getChurushenheTiwen() {
        return churushenheTiwen;
    }
    /**
	 * 获取：居民体温
	 */

    public void setChurushenheTiwen(Double churushenheTiwen) {
        this.churushenheTiwen = churushenheTiwen;
    }
    /**
	 * 设置：申请材料
	 */
    public String getChurushenheFile() {
        return churushenheFile;
    }
    /**
	 * 获取：申请材料
	 */

    public void setChurushenheFile(String churushenheFile) {
        this.churushenheFile = churushenheFile;
    }
    /**
	 * 设置：出入日期
	 */
    public Date getChurushenheTime() {
        return churushenheTime;
    }
    /**
	 * 获取：出入日期
	 */

    public void setChurushenheTime(Date churushenheTime) {
        this.churushenheTime = churushenheTime;
    }
    /**
	 * 设置：备注
	 */
    public String getChurushenheText() {
        return churushenheText;
    }
    /**
	 * 获取：备注
	 */

    public void setChurushenheText(String churushenheText) {
        this.churushenheText = churushenheText;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getChurushenheYesnoTypes() {
        return churushenheYesnoTypes;
    }
    /**
	 * 获取：申请状态
	 */

    public void setChurushenheYesnoTypes(Integer churushenheYesnoTypes) {
        this.churushenheYesnoTypes = churushenheYesnoTypes;
    }
    /**
	 * 设置：申请结果
	 */
    public String getChurushenheYesnoText() {
        return churushenheYesnoText;
    }
    /**
	 * 获取：申请结果
	 */

    public void setChurushenheYesnoText(String churushenheYesnoText) {
        this.churushenheYesnoText = churushenheYesnoText;
    }
    /**
	 * 设置：添加日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加日期
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
        return "Churushenhe{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", churushenheTypes=" + churushenheTypes +
            ", churushenheTiwen=" + churushenheTiwen +
            ", churushenheFile=" + churushenheFile +
            ", churushenheTime=" + churushenheTime +
            ", churushenheText=" + churushenheText +
            ", churushenheYesnoTypes=" + churushenheYesnoTypes +
            ", churushenheYesnoText=" + churushenheYesnoText +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
