package com.kpnoh.myblog.user.repository;

import com.kpnoh.myblog.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
