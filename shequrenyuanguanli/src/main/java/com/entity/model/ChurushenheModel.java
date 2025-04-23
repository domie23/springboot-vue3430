package com.entity.model;

import com.entity.ChurushenheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 出入申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChurushenheModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 居民
     */
    private Integer yonghuId;


    /**
     * 出入类型
     */
    private Integer churushenheTypes;


    /**
     * 居民体温
     */
    private Double churushenheTiwen;


    /**
     * 申请材料
     */
    private String churushenheFile;


    /**
     * 出入日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date churushenheTime;


    /**
     * 备注
     */
    private String churushenheText;


    /**
     * 申请状态
     */
    private Integer churushenheYesnoTypes;


    /**
     * 申请结果
     */
    private String churushenheYesnoText;


    /**
     * 添加日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：居民
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：居民
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：出入类型
	 */
    public Integer getChurushenheTypes() {
        return churushenheTypes;
    }


    /**
	 * 设置：出入类型
	 */
    public void setChurushenheTypes(Integer churushenheTypes) {
        this.churushenheTypes = churushenheTypes;
    }
    /**
	 * 获取：居民体温
	 */
    public Double getChurushenheTiwen() {
        return churushenheTiwen;
    }


    /**
	 * 设置：居民体温
	 */
    public void setChurushenheTiwen(Double churushenheTiwen) {
        this.churushenheTiwen = churushenheTiwen;
    }
    /**
	 * 获取：申请材料
	 */
    public String getChurushenheFile() {
        return churushenheFile;
    }


    /**
	 * 设置：申请材料
	 */
    public void setChurushenheFile(String churushenheFile) {
        this.churushenheFile = churushenheFile;
    }
    /**
	 * 获取：出入日期
	 */
    public Date getChurushenheTime() {
        return churushenheTime;
    }


    /**
	 * 设置：出入日期
	 */
    public void setChurushenheTime(Date churushenheTime) {
        this.churushenheTime = churushenheTime;
    }
    /**
	 * 获取：备注
	 */
    public String getChurushenheText() {
        return churushenheText;
    }


    /**
	 * 设置：备注
	 */
    public void setChurushenheText(String churushenheText) {
        this.churushenheText = churushenheText;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getChurushenheYesnoTypes() {
        return churushenheYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setChurushenheYesnoTypes(Integer churushenheYesnoTypes) {
        this.churushenheYesnoTypes = churushenheYesnoTypes;
    }
    /**
	 * 获取：申请结果
	 */
    public String getChurushenheYesnoText() {
        return churushenheYesnoText;
    }


    /**
	 * 设置：申请结果
	 */
    public void setChurushenheYesnoText(String churushenheYesnoText) {
        this.churushenheYesnoText = churushenheYesnoText;
    }
    /**
	 * 获取：添加日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加日期
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
