package com.entity.vo;

import com.entity.ShequjubaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 社区举报
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shequjubao")
public class ShequjubaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 社区
     */

    @TableField(value = "shequ_id")
    private Integer shequId;


    /**
     * 举报标题
     */

    @TableField(value = "shequjubao_name")
    private String shequjubaoName;


    /**
     * 举报类型
     */

    @TableField(value = "shequjubao_types")
    private Integer shequjubaoTypes;


    /**
     * 举报详情
     */

    @TableField(value = "shequjubao_content")
    private String shequjubaoContent;


    /**
     * 举报时间
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
	 * 设置：举报标题
	 */
    public String getShequjubaoName() {
        return shequjubaoName;
    }


    /**
	 * 获取：举报标题
	 */

    public void setShequjubaoName(String shequjubaoName) {
        this.shequjubaoName = shequjubaoName;
    }
    /**
	 * 设置：举报类型
	 */
    public Integer getShequjubaoTypes() {
        return shequjubaoTypes;
    }


    /**
	 * 获取：举报类型
	 */

    public void setShequjubaoTypes(Integer shequjubaoTypes) {
        this.shequjubaoTypes = shequjubaoTypes;
    }
    /**
	 * 设置：举报详情
	 */
    public String getShequjubaoContent() {
        return shequjubaoContent;
    }


    /**
	 * 获取：举报详情
	 */

    public void setShequjubaoContent(String shequjubaoContent) {
        this.shequjubaoContent = shequjubaoContent;
    }
    /**
	 * 设置：举报时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：举报时间
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
