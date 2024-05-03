package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LvyougoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LvyougoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LvyougoumaiView;


/**
 * 旅游购买
 *
 * @author 
 * @email 
 * @date 2021-02-24 18:10:35
 */
public interface LvyougoumaiService extends IService<LvyougoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LvyougoumaiVO> selectListVO(Wrapper<LvyougoumaiEntity> wrapper);
   	
   	LvyougoumaiVO selectVO(@Param("ew") Wrapper<LvyougoumaiEntity> wrapper);
   	
   	List<LvyougoumaiView> selectListView(Wrapper<LvyougoumaiEntity> wrapper);
   	
   	LvyougoumaiView selectView(@Param("ew") Wrapper<LvyougoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LvyougoumaiEntity> wrapper);
   	
}

