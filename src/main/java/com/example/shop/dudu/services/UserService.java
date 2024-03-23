package com.example.shop.dudu.services;

import com.example.shop.dudu.model.User;
import com.example.shop.dudu.model.enums.Role;
import com.example.shop.dudu.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public boolean createUser(User user) {
        String email = user.getEmail();
        if (userRepository.findByEmail(email) != null) return false;
        user.setActive(true);
        user.getRoles().add(Role.ROL_USER);
        log.info("Saving new User with email: {}", email);
        return true;
    }
}