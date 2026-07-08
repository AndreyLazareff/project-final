package com.lazareff.taskmanager.dto.user;

import com.lazareff.taskmanager.enums.RoleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateRequest {

    private String firstName;

    private String lastName;

    private boolean enabled;

    private RoleType role;

}
