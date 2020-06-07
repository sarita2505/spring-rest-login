package com.spring.dao.impl;

import com.spring.model.LoginUser;
import com.spring.utils.LoginUserRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class LoginUserDaoImpl extends AbstractLoginUserDao<LoginUser, Integer> {
    private static final String insert_row = "insert into login(email,password) values(?,?)";
    private static final String update_row = "update login set email=?,password=? where id=? ";
    private static final String delete_row = "delete from login where id=?";
    private static final String find_row_by_id = "select * from login where id=?";
    private static final String find_all = "select * from login";

    public LoginUserDaoImpl(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    //    @Autowired
//    private RestTemplate template;
    @Override
    public Integer create(LoginUser loginUser) {
        return getJdbcTemplate().update(insert_row, new Object[]{loginUser.getEmail(), loginUser.getPassword()});
    }

    @Override
    public Integer update(LoginUser loginUser, Integer id) {
        return getJdbcTemplate().update(update_row,new Object[]{loginUser.getEmail(),loginUser.getPassword(),id});
    }

    @Override
    public Integer delete(Integer id) {
        return getJdbcTemplate().update(delete_row,new Object[]{id});
    }

    @Override
    public LoginUser findById(Integer id) {
        return getJdbcTemplate().queryForObject(find_row_by_id,new LoginUserRowMapper(),new Object[]{id});
    }

    @Override
    public List<LoginUser> findAll() {
        return getJdbcTemplate().query(find_all,new LoginUserRowMapper());
    }
}
