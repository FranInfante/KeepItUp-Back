package com.example.keepitup.repository;

import com.example.keepitup.model.entities.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersInfoRepository extends JpaRepository<UserInfo, Integer> {

}