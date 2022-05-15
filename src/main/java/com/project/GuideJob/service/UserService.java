package com.project.GuideJob.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.project.GuideJob.model.User;
import com.project.GuideJob.model.UserBody;

import java.util.List;
public interface UserService extends UserDetailsService {

    User save(UserBody user);

    List<User> findAll();

    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserBody update(UserBody userBody);
}
