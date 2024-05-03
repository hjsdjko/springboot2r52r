package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusslvyoufanganEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusslvyoufanganVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusslvyoufanganView;


/**
 * 旅游方案评论表
 *
 * @author 
 * @email 
 * @date 2021-02-24 18:10:35
 */
public interface DiscusslvyoufanganService extends IService<DiscusslvyoufanganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusslvyoufanganVO> selectListVO(Wrapper<DiscusslvyoufanganEntity> wrapper);
   	
   	DiscusslvyoufanganVO selectVO(@Param("ew") Wrapper<DiscusslvyoufanganEntity> wrapper);
   	
   	List<DiscusslvyoufanganView> selectListView(Wrapper<DiscusslvyoufanganEntity> wrapper);
   	
   	DiscusslvyoufanganView selectView(@Param("ew") Wrapper<DiscusslvyoufanganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusslvyoufanganEntity> wrapper);
   	
}

