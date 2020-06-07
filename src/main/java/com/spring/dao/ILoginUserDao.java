package com.spring.dao;

import java.util.List;

public interface ILoginUserDao<T,I> {
    I  create(T t);
    I update(T t,I i);
    I delete(I i);
    T findById(I i);
    List<T> findAll();
}
