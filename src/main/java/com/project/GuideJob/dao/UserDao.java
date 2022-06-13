package com.project.GuideJob.dao;

import com.project.GuideJob.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
    @Query("select u from User u where u.userName = ?1")
    Optional<User> findByUsername(String userName);
}
