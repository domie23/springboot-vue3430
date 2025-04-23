package com.entity.view;

import com.entity.ShequEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 社区信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shequ")
public class ShequView extends ShequEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 社区类型的值
		*/
		private String shequValue;



	public ShequView() {

	}

	public ShequView(ShequEntity shequEntity) {
		try {
			BeanUtils.copyProperties(this, shequEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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















}
