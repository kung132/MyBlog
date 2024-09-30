package com.kpnoh.myblog.user.service;

import com.kpnoh.myblog.user.dto.UserDto;
import com.kpnoh.myblog.user.entity.User;
import com.kpnoh.myblog.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    public List<User> getAllUsers() { return userRepository.findAll(); }

    @Transactional
    public User updateUser(Long id, UserDto userDto) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당하는 아이디가 없습니다."));

        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setPhone(userDto.getPhone());

        return userRepository.save(user);
    }

    @Transactional
    public User createUser(UserDto userDto) {
        return userRepository.save(userDto.toEntity(userDto));
    }

    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }


}
