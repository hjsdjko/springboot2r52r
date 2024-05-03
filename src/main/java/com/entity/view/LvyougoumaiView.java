package com.entity.view;

import com.entity.LvyougoumaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 旅游购买
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-24 18:10:35
 */
@TableName("lvyougoumai")
public class LvyougoumaiView  extends LvyougoumaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LvyougoumaiView(){
	}
 
 	public LvyougoumaiView(LvyougoumaiEntity lvyougoumaiEntity){
 	try {
			BeanUtils.copyProperties(this, lvyougoumaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
