package com.spring.service;

import java.util.List;

public interface ILoginUserService<T,I> {
    I  create(T t);
    I update(T t,I i);
    I delete(I i);
    T findById(I i);
    List<T> findAll();
}
