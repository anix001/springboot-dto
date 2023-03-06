package com.dtoexample.springbootDto.service;

import com.dtoexample.springbootDto.dto.UserLocationDTO;

import java.util.List;

public interface UserService {
    List<UserLocationDTO> getAllUsersLocation();
}
