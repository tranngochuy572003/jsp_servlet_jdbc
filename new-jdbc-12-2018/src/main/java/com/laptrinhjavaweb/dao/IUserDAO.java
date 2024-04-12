package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.model.UserModel;
import com.laptrinhjavaweb.paging.Pageble;

import java.util.List;

public interface IUserDAO extends GenericDAO<UserModel> {

  UserModel findByUserNameAndPasswordAndStatus(String userName,String password,Integer status);




}
