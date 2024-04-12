package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.dao.IUserDAO;
import com.laptrinhjavaweb.model.UserModel;
import com.laptrinhjavaweb.service.IUserService;

import javax.inject.Inject;

public class UserService implements IUserService {

  @Inject
  private IUserDAO userDAO;

  @Override
  public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, int status) {
    return userDAO.findByUserNameAndPasswordAndStatus(userName, password, status);

  }
}
