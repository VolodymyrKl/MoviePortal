package com.movieportal.service;

import com.movieportal.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public void saveUser(User user);

    public User getUserById(Long id);

    public User getUserByUserName(String name);

    public boolean userIsExisting(String name);

}
