package com.movieportal.repository;

import com.movieportal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User getByUserName(String userName);

    User getUserById(Long id);

    User saveAndFlush(User user);

}


