package com.dao;

import com.entity.LvyougoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LvyougoumaiVO;
import com.entity.view.LvyougoumaiView;


/**
 * 旅游购买
 * 
 * @author 
 * @email 
 * @date 2021-02-24 18:10:35
 */
public interface LvyougoumaiDao extends BaseMapper<LvyougoumaiEntity> {
	
	List<LvyougoumaiVO> selectListVO(@Param("ew") Wrapper<LvyougoumaiEntity> wrapper);
	
	LvyougoumaiVO selectVO(@Param("ew") Wrapper<LvyougoumaiEntity> wrapper);
	
	List<LvyougoumaiView> selectListView(@Param("ew") Wrapper<LvyougoumaiEntity> wrapper);

	List<LvyougoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<LvyougoumaiEntity> wrapper);
	
	LvyougoumaiView selectView(@Param("ew") Wrapper<LvyougoumaiEntity> wrapper);
	
}
