package com.entity.view;

import com.entity.ShequjubaoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 社区举报
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shequjubao")
public class ShequjubaoView extends ShequjubaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 举报类型的值
		*/
		private String shequjubaoValue;



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

	public ShequjubaoView() {

	}

	public ShequjubaoView(ShequjubaoEntity shequjubaoEntity) {
		try {
			BeanUtils.copyProperties(this, shequjubaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 举报类型的值
			*/
			public String getShequjubaoValue() {
				return shequjubaoValue;
			}
			/**
			* 设置： 举报类型的值
			*/
			public void setShequjubaoValue(String shequjubaoValue) {
				this.shequjubaoValue = shequjubaoValue;
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
