package com.entity.view;

import com.entity.FangjainEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 房间信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fangjain")
public class FangjainView extends FangjainEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 房间类型的值
		*/
		private String fangjainValue;



		//级联表 zhuzhai
			/**
			* 住宅地址
			*/
			private String zhuzhaiName;
			/**
			* 住宅类型
			*/
			private Integer zhuzhaiTypes;
				/**
				* 住宅类型的值
				*/
				private String zhuzhaiValue;
			/**
			* 住宅详情
			*/
			private String zhuzhaiContent;

	public FangjainView() {

	}

	public FangjainView(FangjainEntity fangjainEntity) {
		try {
			BeanUtils.copyProperties(this, fangjainEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 房间类型的值
			*/
			public String getFangjainValue() {
				return fangjainValue;
			}
			/**
			* 设置： 房间类型的值
			*/
			public void setFangjainValue(String fangjainValue) {
				this.fangjainValue = fangjainValue;
			}


























				//级联表的get和set zhuzhai

					/**
					* 获取： 住宅地址
					*/
					public String getZhuzhaiName() {
						return zhuzhaiName;
					}
					/**
					* 设置： 住宅地址
					*/
					public void setZhuzhaiName(String zhuzhaiName) {
						this.zhuzhaiName = zhuzhaiName;
					}

					/**
					* 获取： 住宅类型
					*/
					public Integer getZhuzhaiTypes() {
						return zhuzhaiTypes;
					}
					/**
					* 设置： 住宅类型
					*/
					public void setZhuzhaiTypes(Integer zhuzhaiTypes) {
						this.zhuzhaiTypes = zhuzhaiTypes;
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


					/**
					* 获取： 住宅详情
					*/
					public String getZhuzhaiContent() {
						return zhuzhaiContent;
					}
					/**
					* 设置： 住宅详情
					*/
					public void setZhuzhaiContent(String zhuzhaiContent) {
						this.zhuzhaiContent = zhuzhaiContent;
					}


}
