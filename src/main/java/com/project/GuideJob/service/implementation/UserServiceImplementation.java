package com.project.GuideJob.service.implementation;

import com.project.GuideJob.model.User;
import com.project.GuideJob.model.UserBody;
import com.project.GuideJob.repo.UserRepo;
import com.project.GuideJob.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


@Service(value = "userService")
@AllArgsConstructor
public class UserServiceImplementation implements UserService {
    private final UserRepo userRepo;
    private final static String USER_NOT_FOUND_MSG="USER WITH EMAIL:%s NOT FOUND";

    @Override
    public User loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepo.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException(
                                String.format(USER_NOT_FOUND_MSG, email)));

    }


    @Override
    public User save(UserBody user) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public User findOne(String username) {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public UserBody update(UserBody userBody) {
        return null;
    }
}
