package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.LvyougoumaiEntity;
import com.entity.view.LvyougoumaiView;

import com.service.LvyougoumaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 旅游购买
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-24 18:10:35
 */
@RestController
@RequestMapping("/lvyougoumai")
public class LvyougoumaiController {
    @Autowired
    private LvyougoumaiService lvyougoumaiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LvyougoumaiEntity lvyougoumai, HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			lvyougoumai.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LvyougoumaiEntity> ew = new EntityWrapper<LvyougoumaiEntity>();
		PageUtils page = lvyougoumaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lvyougoumai), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LvyougoumaiEntity lvyougoumai, HttpServletRequest request){
        EntityWrapper<LvyougoumaiEntity> ew = new EntityWrapper<LvyougoumaiEntity>();
		PageUtils page = lvyougoumaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lvyougoumai), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LvyougoumaiEntity lvyougoumai){
       	EntityWrapper<LvyougoumaiEntity> ew = new EntityWrapper<LvyougoumaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( lvyougoumai, "lvyougoumai")); 
        return R.ok().put("data", lvyougoumaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LvyougoumaiEntity lvyougoumai){
        EntityWrapper< LvyougoumaiEntity> ew = new EntityWrapper< LvyougoumaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( lvyougoumai, "lvyougoumai")); 
		LvyougoumaiView lvyougoumaiView =  lvyougoumaiService.selectView(ew);
		return R.ok("查询旅游购买成功").put("data", lvyougoumaiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LvyougoumaiEntity lvyougoumai = lvyougoumaiService.selectById(id);
        return R.ok().put("data", lvyougoumai);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LvyougoumaiEntity lvyougoumai = lvyougoumaiService.selectById(id);
        return R.ok().put("data", lvyougoumai);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LvyougoumaiEntity lvyougoumai, HttpServletRequest request){
    	lvyougoumai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lvyougoumai);
        lvyougoumaiService.insert(lvyougoumai);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LvyougoumaiEntity lvyougoumai, HttpServletRequest request){
    	lvyougoumai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lvyougoumai);
        lvyougoumaiService.insert(lvyougoumai);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody LvyougoumaiEntity lvyougoumai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(lvyougoumai);
        lvyougoumaiService.updateById(lvyougoumai);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        lvyougoumaiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<LvyougoumaiEntity> wrapper = new EntityWrapper<LvyougoumaiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = lvyougoumaiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
