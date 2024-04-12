package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.dao.impl.CategoryDAO;
import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.service.ICategoryService;

import javax.inject.Inject;
import java.util.List;

public class CategoryService implements ICategoryService {
//  private ICategoryDAO categoryDao;
//
//  public CategoryService(){
//    categoryDao = new CategoryDAO();
  //instance cua iCategoryDAO
//  }

  @Inject

private ICategoryDAO categoryDao;
  @Override
  public List<CategoryModel> findAll(){
    return categoryDao.findAll();
  }
}
