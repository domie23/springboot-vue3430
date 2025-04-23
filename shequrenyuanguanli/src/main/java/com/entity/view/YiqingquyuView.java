package com.entity.view;

import com.entity.YiqingquyuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 疫情区域信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yiqingquyu")
public class YiqingquyuView extends YiqingquyuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 疫情区域类型的值
		*/
		private String yiqingquyuValue;



	public YiqingquyuView() {

	}

	public YiqingquyuView(YiqingquyuEntity yiqingquyuEntity) {
		try {
			BeanUtils.copyProperties(this, yiqingquyuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 疫情区域类型的值
			*/
			public String getYiqingquyuValue() {
				return yiqingquyuValue;
			}
			/**
			* 设置： 疫情区域类型的值
			*/
			public void setYiqingquyuValue(String yiqingquyuValue) {
				this.yiqingquyuValue = yiqingquyuValue;
			}















}
