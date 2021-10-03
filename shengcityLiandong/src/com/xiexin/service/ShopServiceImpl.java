package com.xiexin.service;

import com.xiexin.bean.Shop;
import com.xiexin.bean.ShopExample;
import com.xiexin.dao.ShopDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("shopService")
public class ShopServiceImpl implements ShopService {
	@Autowired(required = false)
	private ShopDAO shopDAO;
	public long countByExample(ShopExample example){
    	return shopDAO.countByExample(example);
    }

	public int deleteByExample(ShopExample example){
    	return shopDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return shopDAO.deleteByPrimaryKey(id);
    }

	public int insert(Shop record){
    	return shopDAO.insert(record);
    }

	public int insertSelective(Shop record){
    	return shopDAO.insertSelective(record);
    }

	public List<Shop> selectByExample(ShopExample example){
    	return shopDAO.selectByExample(example);
    }

	public Shop selectByPrimaryKey(Integer id){
    	return shopDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Shop record, ShopExample example){
    	return shopDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Shop record, ShopExample example){
    	return shopDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Shop record){
    	return shopDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Shop record){
    	return shopDAO.updateByPrimaryKey(record);
    }


}
