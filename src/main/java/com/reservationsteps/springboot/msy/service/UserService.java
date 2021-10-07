package com.reservationsteps.springboot.msy.service;


import com.reservationsteps.springboot.msy.dto.model.user.UserDTO;

/**
 * User service definitions.
 */
public interface UserService {

    /**
     * Register a new user.
     *
     * @param userDto User data
     *
     * @return Newly created user.
     */
    UserDTO signUp(UserDTO userDto);

    /**
     * Search an existing user with an email.
     *
     * @param email to find user with mail info.
     *
     * @return User found by the system.
     */
    UserDTO findUserByEmail(String email);

    /**
     * Update profile information of the user.
     *
     * @param userDto Updated info of the user.
     *
     * @return Result user data of the operation.
     */
    UserDTO updateProfile(UserDTO userDto);

    /**
     * Update user password.
     *
     * @param userDto User data to be updated.
     *
     * @param newPassword New password of the user.
     *
     * @return New user data info.
     */
    UserDTO changePassword(UserDTO userDto, String newPassword);

}
