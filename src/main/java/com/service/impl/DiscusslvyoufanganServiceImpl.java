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


import com.dao.DiscusslvyoufanganDao;
import com.entity.DiscusslvyoufanganEntity;
import com.service.DiscusslvyoufanganService;
import com.entity.vo.DiscusslvyoufanganVO;
import com.entity.view.DiscusslvyoufanganView;

@Service("discusslvyoufanganService")
public class DiscusslvyoufanganServiceImpl extends ServiceImpl<DiscusslvyoufanganDao, DiscusslvyoufanganEntity> implements DiscusslvyoufanganService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusslvyoufanganEntity> page = this.selectPage(
                new Query<DiscusslvyoufanganEntity>(params).getPage(),
                new EntityWrapper<DiscusslvyoufanganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusslvyoufanganEntity> wrapper) {
		  Page<DiscusslvyoufanganView> page =new Query<DiscusslvyoufanganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusslvyoufanganVO> selectListVO(Wrapper<DiscusslvyoufanganEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusslvyoufanganVO selectVO(Wrapper<DiscusslvyoufanganEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusslvyoufanganView> selectListView(Wrapper<DiscusslvyoufanganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusslvyoufanganView selectView(Wrapper<DiscusslvyoufanganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
