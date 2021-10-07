package com.reservationsteps.springboot.msy.dto.mapper;

import com.reservationsteps.springboot.msy.dto.model.user.RoleDTO;
import com.reservationsteps.springboot.msy.dto.model.user.UserDTO;
import com.reservationsteps.springboot.msy.model.user.User;
import org.modelmapper.ModelMapper;

import java.util.HashSet;
import java.util.stream.Collectors;

public class UserMapper {

    public static UserDTO toUserDTO (User user) {
        return new UserDTO()
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setEmail(user.getEmail())
                .setMobileNumber(user.getMobileNumber())
                // Model mapper is used to map role to RoleDTO class.
                .setRoles(new HashSet<>(
                        user.getRoles().stream()
                                .map(role -> new ModelMapper().map(role, RoleDTO.class))
                                .collect(Collectors.toSet())));
    }
}
