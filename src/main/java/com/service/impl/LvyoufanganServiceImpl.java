package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LvyoufanganDao;
import com.entity.LvyoufanganEntity;
import com.service.LvyoufanganService;
import com.entity.vo.LvyoufanganVO;
import com.entity.view.LvyoufanganView;

@Service("lvyoufanganService")
public class LvyoufanganServiceImpl extends ServiceImpl<LvyoufanganDao, LvyoufanganEntity> implements LvyoufanganService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LvyoufanganEntity> page = this.selectPage(
                new Query<LvyoufanganEntity>(params).getPage(),
                new EntityWrapper<LvyoufanganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LvyoufanganEntity> wrapper) {
		  Page<LvyoufanganView> page =new Query<LvyoufanganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LvyoufanganVO> selectListVO(Wrapper<LvyoufanganEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LvyoufanganVO selectVO(Wrapper<LvyoufanganEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LvyoufanganView> selectListView(Wrapper<LvyoufanganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LvyoufanganView selectView(Wrapper<LvyoufanganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
