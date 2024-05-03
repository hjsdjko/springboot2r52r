package com.entity.vo;

import com.entity.LvyoufanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 旅游方案
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-24 18:10:34
 */
public class LvyoufanganVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 方案名称
	 */
	
	private String fanganmingcheng;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 出发城市
	 */
	
	private String chufachengshi;
		
	/**
	 * 旅游路线
	 */
	
	private String lvyouluxian;
		
	/**
	 * 预定须知
	 */
	
	private String yudingxuzhi;
		
	/**
	 * 行程天数
	 */
	
	private String xingchengtianshu;
		
	/**
	 * 详情简介
	 */
	
	private String xiangqingjianjie;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：方案名称
	 */
	 
	public void setFanganmingcheng(String fanganmingcheng) {
		this.fanganmingcheng = fanganmingcheng;
	}
	
	/**
	 * 获取：方案名称
	 */
	public String getFanganmingcheng() {
		return fanganmingcheng;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：出发城市
	 */
	 
	public void setChufachengshi(String chufachengshi) {
		this.chufachengshi = chufachengshi;
	}
	
	/**
	 * 获取：出发城市
	 */
	public String getChufachengshi() {
		return chufachengshi;
	}
				
	
	/**
	 * 设置：旅游路线
	 */
	 
	public void setLvyouluxian(String lvyouluxian) {
		this.lvyouluxian = lvyouluxian;
	}
	
	/**
	 * 获取：旅游路线
	 */
	public String getLvyouluxian() {
		return lvyouluxian;
	}
				
	
	/**
	 * 设置：预定须知
	 */
	 
	public void setYudingxuzhi(String yudingxuzhi) {
		this.yudingxuzhi = yudingxuzhi;
	}
	
	/**
	 * 获取：预定须知
	 */
	public String getYudingxuzhi() {
		return yudingxuzhi;
	}
				
	
	/**
	 * 设置：行程天数
	 */
	 
	public void setXingchengtianshu(String xingchengtianshu) {
		this.xingchengtianshu = xingchengtianshu;
	}
	
	/**
	 * 获取：行程天数
	 */
	public String getXingchengtianshu() {
		return xingchengtianshu;
	}
				
	
	/**
	 * 设置：详情简介
	 */
	 
	public void setXiangqingjianjie(String xiangqingjianjie) {
		this.xiangqingjianjie = xiangqingjianjie;
	}
	
	/**
	 * 获取：详情简介
	 */
	public String getXiangqingjianjie() {
		return xiangqingjianjie;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
