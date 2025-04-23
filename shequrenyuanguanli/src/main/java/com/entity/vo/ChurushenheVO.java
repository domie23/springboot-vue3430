package com.entity.vo;

import com.entity.ChurushenheEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 出入申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("churushenhe")
public class ChurushenheVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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

}
