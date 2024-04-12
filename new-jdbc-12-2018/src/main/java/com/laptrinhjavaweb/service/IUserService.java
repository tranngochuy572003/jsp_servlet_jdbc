package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.model.UserModel;
import com.laptrinhjavaweb.paging.Pageble;

import java.util.List;

public interface IUserService {
  UserModel findByUserNameAndPasswordAndStatus(String userName, String password, int status);


}



