package com.example.devTest.user.controller;

import com.example.devTest.user.domain.User;
import com.example.devTest.user.dto.UserRequest;
import com.example.devTest.user.dto.UserResponse;
import com.example.devTest.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<UserResponse> signup(@RequestBody UserRequest request) {
        userService.createUser(request);
        return ResponseEntity.ok(new UserResponse());
    }

    @GetMapping("/")
    public ResponseEntity<UserResponse> getAllUser() {
        userService.getAllUser();
        return ResponseEntity.ok(new UserResponse());
    }
}
