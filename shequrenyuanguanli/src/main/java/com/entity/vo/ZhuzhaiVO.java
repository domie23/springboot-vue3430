package com.entity.vo;

import com.entity.ZhuzhaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 住宅信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhuzhai")
public class ZhuzhaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
