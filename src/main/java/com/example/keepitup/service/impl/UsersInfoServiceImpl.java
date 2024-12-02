package com.example.keepitup.service.impl;


import com.example.keepitup.util.mappers.UsersInfoMapper;
import com.example.keepitup.model.dtos.UserInfoDTO;
import com.example.keepitup.model.entities.UserInfo;
import com.example.keepitup.repository.UsersInfoRepository;
import com.example.keepitup.service.UsersInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersInfoServiceImpl implements UsersInfoService {

    private UsersInfoRepository usersInfoRepository;

    @Override
    public UserInfoDTO saveUserInfo(UserInfoDTO userInfoDTO) {
        UserInfo userInfo = UsersInfoMapper.usersInfoDTOToEntity(userInfoDTO);
        UserInfo savedUserInfo = usersInfoRepository.save(userInfo);
        return UsersInfoMapper.usersInfoEntityToDTO(savedUserInfo);
    }

    @Override
    public UserInfoDTO getUserInfoByUserId(Integer userId) {
        UserInfo userInfo = usersInfoRepository.findById(userId).orElseThrow(() -> new RuntimeException("User Info not found"));
        return UsersInfoMapper.usersInfoEntityToDTO(userInfo);
    }
}