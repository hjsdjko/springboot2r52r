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


import com.dao.LvyougoumaiDao;
import com.entity.LvyougoumaiEntity;
import com.service.LvyougoumaiService;
import com.entity.vo.LvyougoumaiVO;
import com.entity.view.LvyougoumaiView;

@Service("lvyougoumaiService")
public class LvyougoumaiServiceImpl extends ServiceImpl<LvyougoumaiDao, LvyougoumaiEntity> implements LvyougoumaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LvyougoumaiEntity> page = this.selectPage(
                new Query<LvyougoumaiEntity>(params).getPage(),
                new EntityWrapper<LvyougoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LvyougoumaiEntity> wrapper) {
		  Page<LvyougoumaiView> page =new Query<LvyougoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LvyougoumaiVO> selectListVO(Wrapper<LvyougoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LvyougoumaiVO selectVO(Wrapper<LvyougoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LvyougoumaiView> selectListView(Wrapper<LvyougoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LvyougoumaiView selectView(Wrapper<LvyougoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
