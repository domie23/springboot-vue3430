package com.entity.vo;

import com.entity.ShequEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 社区信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shequ")
public class ShequVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
