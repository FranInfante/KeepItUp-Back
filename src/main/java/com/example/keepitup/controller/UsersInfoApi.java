package com.example.keepitup.controller;

import com.example.keepitup.model.dtos.UserInfoDTO;
import com.example.keepitup.util.UriConstants;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(UriConstants.INFO)
public interface UsersInfoApi {

    @PostMapping
    ResponseEntity<UserInfoDTO> saveUserInfo(@RequestBody UserInfoDTO userInfoDTO);

    @GetMapping(UriConstants.BY_ID)
    ResponseEntity<UserInfoDTO> getUserInfoByUserId(@PathVariable Integer userId);
}
