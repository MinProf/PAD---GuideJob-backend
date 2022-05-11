package com.project.GuideJob.repo;

import com.project.GuideJob.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface UserRepo extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
}
