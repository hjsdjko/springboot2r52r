package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LvyoufanganEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LvyoufanganVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LvyoufanganView;


/**
 * 旅游方案
 *
 * @author 
 * @email 
 * @date 2021-02-24 18:10:34
 */
public interface LvyoufanganService extends IService<LvyoufanganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LvyoufanganVO> selectListVO(Wrapper<LvyoufanganEntity> wrapper);
   	
   	LvyoufanganVO selectVO(@Param("ew") Wrapper<LvyoufanganEntity> wrapper);
   	
   	List<LvyoufanganView> selectListView(Wrapper<LvyoufanganEntity> wrapper);
   	
   	LvyoufanganView selectView(@Param("ew") Wrapper<LvyoufanganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LvyoufanganEntity> wrapper);
   	
}

