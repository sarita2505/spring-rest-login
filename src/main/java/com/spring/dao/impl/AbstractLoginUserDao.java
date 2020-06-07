package com.spring.dao.impl;

import com.spring.dao.ILoginUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class AbstractLoginUserDao<T,I> implements ILoginUserDao<T,I> {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public AbstractLoginUserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
