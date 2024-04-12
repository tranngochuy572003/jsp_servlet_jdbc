package com.laptrinhjavaweb.mapper;

import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.model.RoleModel;
import com.laptrinhjavaweb.model.UserModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<UserModel> {
  @Override
  public UserModel mapRow(ResultSet resultSet) {
    UserModel user = null;
    try {
      user  = new UserModel();
      user .setId(resultSet.getLong("id"));
      user .setUserName(resultSet.getString("userName"));
      user .setFullName(resultSet.getString("FullName"));
      user .setPassword(resultSet.getString("Password"));
      user .setStatus(resultSet.getInt("Status"));

      try {
        RoleModel role = new RoleModel();
        role.setCode(resultSet.getString("code"));
        role.setName(resultSet.getString("name"));
        user.setRole(role);
      }catch (Exception e){
        System.out.println( e.getMessage());

      }
      return user;
    } catch (SQLException e) {
      return null;

    }

  }
}
