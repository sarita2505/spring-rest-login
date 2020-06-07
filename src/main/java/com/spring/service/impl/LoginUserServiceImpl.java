package com.spring.service.impl;

import com.spring.dao.ILoginUserDao;
import com.spring.exception.LoginUserException;
import com.spring.exception.error.ErrorClass;
import com.spring.model.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginUserServiceImpl extends AbstractLoginUserService<LoginUser, Integer> {
    @Autowired
    private ILoginUserDao<LoginUser,Integer> userDao;

    public LoginUserServiceImpl(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public Integer create(LoginUser loginUser) {
        Integer i=0;
        try {
            i = userDao.create(loginUser);
        } catch (LoginUserException e) {
            ErrorClass errorClass=new ErrorClass("data is not inserted",500);
            throw  new LoginUserException("dta is not inserted",errorClass);
        }
        return i;
    }

    @Override
    public Integer update(LoginUser loginUser,Integer id)
    {
        Integer i=0;
        try {
            i = userDao.update(loginUser,id);
        } catch (LoginUserException e) {
            ErrorClass errorClass=new ErrorClass("data is not updated",500);
            throw  new LoginUserException("dta is not updated",errorClass);
        }
        return i;
    }

    @Override
    public Integer delete(Integer id) {
        Integer i=0;
        try {
            i = userDao.delete(id);
        } catch (LoginUserException e) {
            ErrorClass errorClass=new ErrorClass("data is not deleted",500);
            throw  new LoginUserException("dta is not deleted",errorClass);
        }
        return i;
    }

    @Override
    public LoginUser findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public List<LoginUser> findAll() {
        return userDao.findAll();
    }
}
