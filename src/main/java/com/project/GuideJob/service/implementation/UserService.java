package com.project.GuideJob.service.implementation;

import com.project.GuideJob.model.User;
import com.project.GuideJob.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class UserService implements UserDetailsService {
    private final UserRepo userRepo;
    private final static String USER_NOT_FOUND_MSG="USER WITH EMAIL:%s NOT FOUND";

    @Override
    public User loadUserByUsername(String email) throws UsernameNotFoundException {
        // TODO: Implementare metoda
        return null;

    }


}
