package com.entity.vo;

import com.entity.YiqingquyuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 疫情区域信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yiqingquyu")
public class YiqingquyuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
