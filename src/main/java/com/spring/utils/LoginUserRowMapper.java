package com.spring.utils;

import com.spring.model.LoginUser;
import org.springframework.jdbc.core.RowMapper;
import sun.rmi.runtime.Log;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginUserRowMapper implements RowMapper<LoginUser> {
    @Override
    public LoginUser mapRow(ResultSet resultSet, int i) throws SQLException {
        LoginUser user=new LoginUser();
        user.setId(resultSet.getInt(1));
        user.setEmail(resultSet.getString(2));
        user.setPassword(resultSet.getString(3));
        return user;
    }
}
