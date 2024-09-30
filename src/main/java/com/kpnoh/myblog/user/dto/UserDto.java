package com.kpnoh.myblog.user.dto;

import com.kpnoh.myblog.user.entity.User;
import lombok.*;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;

    private String password;

    private String email;

    private String phone;

    public User toEntity(UserDto userDto) {
        return User.builder()
                .id(userDto.getId())
                .password(userDto.getPassword())
                .email(userDto.getEmail())
                .phone(userDto.getPhone())
                .build();
    }
}
