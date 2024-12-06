package com.example.keepitup.service;

import com.example.keepitup.model.dtos.UsersDTO;
import com.example.keepitup.util.UserJwt;

import java.util.List;
import java.util.Optional;

public interface UsersService {
    UsersDTO getUserById(Integer id);

    List<UsersDTO> getAllUsers();

    List<UsersDTO> searchUsersByUsername(String username);

    UsersDTO createUser(UsersDTO newUser) throws Exception;

    Optional<UsersDTO> loginUser(String identifier, String password);

    void deleteUserById(Integer id);

    void updateUser(Integer id, UsersDTO updateUser) throws Exception;

    UserJwt authenticateUser(UsersDTO userDTO) throws Exception;
}
