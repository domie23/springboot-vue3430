package com.entity.vo;

import com.entity.FangjainEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 房间信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("fangjain")
public class FangjainVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
