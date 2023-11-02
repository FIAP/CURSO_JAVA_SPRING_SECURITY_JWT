package com.springsecutiry.fiap.modules.user.request;

import com.springsecutiry.fiap.modules.user.entity.enums.UserRole;

public record UserRequest(String login, String password, UserRole role) {
}
