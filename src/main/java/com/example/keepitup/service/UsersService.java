package com.example.keepitup.service;


import com.example.keepitup.model.dtos.UsersDTO;

import java.util.List;

public interface UsersService {
    List<UsersDTO> getAllUsers();
    UsersDTO getUserById(Integer id);
    UsersDTO saveUser(UsersDTO userDTO);
    void deleteUser(Integer id);
}