package com.dao;

import com.entity.DiscusslvyoufanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusslvyoufanganVO;
import com.entity.view.DiscusslvyoufanganView;


/**
 * 旅游方案评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-24 18:10:35
 */
public interface DiscusslvyoufanganDao extends BaseMapper<DiscusslvyoufanganEntity> {
	
	List<DiscusslvyoufanganVO> selectListVO(@Param("ew") Wrapper<DiscusslvyoufanganEntity> wrapper);
	
	DiscusslvyoufanganVO selectVO(@Param("ew") Wrapper<DiscusslvyoufanganEntity> wrapper);
	
	List<DiscusslvyoufanganView> selectListView(@Param("ew") Wrapper<DiscusslvyoufanganEntity> wrapper);

	List<DiscusslvyoufanganView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusslvyoufanganEntity> wrapper);
	
	DiscusslvyoufanganView selectView(@Param("ew") Wrapper<DiscusslvyoufanganEntity> wrapper);
	
}
