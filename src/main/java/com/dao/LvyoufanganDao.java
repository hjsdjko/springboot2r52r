package com.dao;

import com.entity.LvyoufanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LvyoufanganVO;
import com.entity.view.LvyoufanganView;


/**
 * 旅游方案
 * 
 * @author 
 * @email 
 * @date 2021-02-24 18:10:34
 */
public interface LvyoufanganDao extends BaseMapper<LvyoufanganEntity> {
	
	List<LvyoufanganVO> selectListVO(@Param("ew") Wrapper<LvyoufanganEntity> wrapper);
	
	LvyoufanganVO selectVO(@Param("ew") Wrapper<LvyoufanganEntity> wrapper);
	
	List<LvyoufanganView> selectListView(@Param("ew") Wrapper<LvyoufanganEntity> wrapper);

	List<LvyoufanganView> selectListView(Pagination page,@Param("ew") Wrapper<LvyoufanganEntity> wrapper);
	
	LvyoufanganView selectView(@Param("ew") Wrapper<LvyoufanganEntity> wrapper);
	
}
