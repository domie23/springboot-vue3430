package com.entity.view;

import com.entity.ZhuzhaiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 住宅信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhuzhai")
public class ZhuzhaiView extends ZhuzhaiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 住宅类型的值
		*/
		private String zhuzhaiValue;



		//级联表 shequ
			/**
			* 社区名称
			*/
			private String shequName;
			/**
			* 社区类型
			*/
			private Integer shequTypes;
				/**
				* 社区类型的值
				*/
				private String shequValue;
			/**
			* 社区详情
			*/
			private String shequContent;

	public ZhuzhaiView() {

	}

	public ZhuzhaiView(ZhuzhaiEntity zhuzhaiEntity) {
		try {
			BeanUtils.copyProperties(this, zhuzhaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 住宅类型的值
			*/
			public String getZhuzhaiValue() {
				return zhuzhaiValue;
			}
			/**
			* 设置： 住宅类型的值
			*/
			public void setZhuzhaiValue(String zhuzhaiValue) {
				this.zhuzhaiValue = zhuzhaiValue;
			}
















				//级联表的get和set shequ

					/**
					* 获取： 社区名称
					*/
					public String getShequName() {
						return shequName;
					}
					/**
					* 设置： 社区名称
					*/
					public void setShequName(String shequName) {
						this.shequName = shequName;
					}

					/**
					* 获取： 社区类型
					*/
					public Integer getShequTypes() {
						return shequTypes;
					}
					/**
					* 设置： 社区类型
					*/
					public void setShequTypes(Integer shequTypes) {
						this.shequTypes = shequTypes;
					}


						/**
						* 获取： 社区类型的值
						*/
						public String getShequValue() {
							return shequValue;
						}
						/**
						* 设置： 社区类型的值
						*/
						public void setShequValue(String shequValue) {
							this.shequValue = shequValue;
						}

					/**
					* 获取： 社区详情
					*/
					public String getShequContent() {
						return shequContent;
					}
					/**
					* 设置： 社区详情
					*/
					public void setShequContent(String shequContent) {
						this.shequContent = shequContent;
					}












}
