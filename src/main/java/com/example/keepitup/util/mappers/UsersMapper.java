package com.example.keepitup.util.mappers;


import com.example.keepitup.model.dtos.UsersDTO;
import com.example.keepitup.model.entities.Users;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UsersMapper {

    public Users userDTOToEntity(UsersDTO usersDTO) {
        if (usersDTO == null) {
            return null;
        }

        Users.UsersBuilder userBuilder = Users.builder()
                .id(usersDTO.getId())
                .username(usersDTO.getUsername())
                .email(usersDTO.getEmail())
                .password(usersDTO.getPassword());

        // Map UserInfoDTO to UserInfo and set the relationship
        if (usersDTO.getUsersInfo() != null) {
            userBuilder.userInfo(UsersInfoMapper.usersInfoDTOToEntity(usersDTO.getUsersInfo()));
        }

        Users user = userBuilder.build();

        // Ensure the relationship is bidirectional
        if (user.getUserInfo() != null) {
            user.getUserInfo().setUser(user);
        }

        return user;
    }

    public UsersDTO userEntityToDTO(Users users) {
        if (users == null) {
            return null;
        }

        return UsersDTO.builder()
                .id(users.getId())
                .username(users.getUsername())
                .email(users.getEmail())
                .password(users.getPassword())
                .usersInfo(UsersInfoMapper.usersInfoEntityToDTO(users.getUserInfo()))
                .build();
    }
}