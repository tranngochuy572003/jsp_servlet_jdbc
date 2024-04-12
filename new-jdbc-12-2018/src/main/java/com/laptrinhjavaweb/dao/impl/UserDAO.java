package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.IUserDAO;
import com.laptrinhjavaweb.mapper.NewMapper;
import com.laptrinhjavaweb.mapper.UserMapper;
import com.laptrinhjavaweb.model.UserModel;
import org.codehaus.jackson.map.ser.StdSerializers;

import java.util.List;

public class UserDAO extends AbstractDAO<UserModel> implements IUserDAO {

  @Override
  public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
    StringBuilder sql = new StringBuilder("select * from user as u ");
    sql.append("inner join role as r on r.id=u.roleid ");
    sql.append("WHERE username = ? and password= ? and status= ? ");

    List<UserModel> users = query(sql.toString(), new UserMapper(),userName,password,status);
    return users.isEmpty() ? null :users.get(0);






  }
}
