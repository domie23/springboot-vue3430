package com.entity.view;

import com.entity.QuyujianchaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 区域疫情检查
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("quyujiancha")
public class QuyujianchaView extends QuyujianchaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 检查类型的值
		*/
		private String quyujianchaValue;



		//级联表 gongzuorenyuan
			/**
			* 工作人员姓名
			*/
			private String gongzuorenyuanName;
			/**
			* 头像
			*/
			private String gongzuorenyuanPhoto;
			/**
			* 手机号
			*/
			private String gongzuorenyuanPhone;
			/**
			* 电子邮箱
			*/
			private String gongzuorenyuanEmail;
			/**
			* 假删
			*/
			private Integer gongzuorenyuanDelete;

		//级联表 yiqingquyu
			/**
			* 疫情区域名称
			*/
			private String yiqingquyuName;
			/**
			* 疫情区域类型
			*/
			private Integer yiqingquyuTypes;
				/**
				* 疫情区域类型的值
				*/
				private String yiqingquyuValue;
			/**
			* 疫情区域详情
			*/
			private String yiqingquyuContent;

	public QuyujianchaView() {

	}

	public QuyujianchaView(QuyujianchaEntity quyujianchaEntity) {
		try {
			BeanUtils.copyProperties(this, quyujianchaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 检查类型的值
			*/
			public String getQuyujianchaValue() {
				return quyujianchaValue;
			}
			/**
			* 设置： 检查类型的值
			*/
			public void setQuyujianchaValue(String quyujianchaValue) {
				this.quyujianchaValue = quyujianchaValue;
			}














				//级联表的get和set gongzuorenyuan

					/**
					* 获取： 工作人员姓名
					*/
					public String getGongzuorenyuanName() {
						return gongzuorenyuanName;
					}
					/**
					* 设置： 工作人员姓名
					*/
					public void setGongzuorenyuanName(String gongzuorenyuanName) {
						this.gongzuorenyuanName = gongzuorenyuanName;
					}

					/**
					* 获取： 头像
					*/
					public String getGongzuorenyuanPhoto() {
						return gongzuorenyuanPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setGongzuorenyuanPhoto(String gongzuorenyuanPhoto) {
						this.gongzuorenyuanPhoto = gongzuorenyuanPhoto;
					}

					/**
					* 获取： 手机号
					*/
					public String getGongzuorenyuanPhone() {
						return gongzuorenyuanPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setGongzuorenyuanPhone(String gongzuorenyuanPhone) {
						this.gongzuorenyuanPhone = gongzuorenyuanPhone;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getGongzuorenyuanEmail() {
						return gongzuorenyuanEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setGongzuorenyuanEmail(String gongzuorenyuanEmail) {
						this.gongzuorenyuanEmail = gongzuorenyuanEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getGongzuorenyuanDelete() {
						return gongzuorenyuanDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setGongzuorenyuanDelete(Integer gongzuorenyuanDelete) {
						this.gongzuorenyuanDelete = gongzuorenyuanDelete;
					}

















				//级联表的get和set yiqingquyu

					/**
					* 获取： 疫情区域名称
					*/
					public String getYiqingquyuName() {
						return yiqingquyuName;
					}
					/**
					* 设置： 疫情区域名称
					*/
					public void setYiqingquyuName(String yiqingquyuName) {
						this.yiqingquyuName = yiqingquyuName;
					}

					/**
					* 获取： 疫情区域类型
					*/
					public Integer getYiqingquyuTypes() {
						return yiqingquyuTypes;
					}
					/**
					* 设置： 疫情区域类型
					*/
					public void setYiqingquyuTypes(Integer yiqingquyuTypes) {
						this.yiqingquyuTypes = yiqingquyuTypes;
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

					/**
					* 获取： 疫情区域详情
					*/
					public String getYiqingquyuContent() {
						return yiqingquyuContent;
					}
					/**
					* 设置： 疫情区域详情
					*/
					public void setYiqingquyuContent(String yiqingquyuContent) {
						this.yiqingquyuContent = yiqingquyuContent;
					}










}
