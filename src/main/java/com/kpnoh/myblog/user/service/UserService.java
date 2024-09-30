package com.kpnoh.myblog.user.service;

import com.kpnoh.myblog.user.entity.User;
import com.kpnoh.myblog.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }
}
