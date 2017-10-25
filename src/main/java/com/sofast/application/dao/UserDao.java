package com.sofast.application.dao;

import com.sofast.application.model.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface UserDao extends CrudRepository<User, String> {
    public User findByEmail(String email);
}