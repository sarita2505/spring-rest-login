package com.spring.service.impl;

import com.spring.service.ILoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class AbstractLoginUserService<T,I> implements ILoginUserService<T,I> {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public AbstractLoginUserService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
