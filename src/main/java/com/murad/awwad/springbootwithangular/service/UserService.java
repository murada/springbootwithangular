package com.murad.awwad.springbootwithangular.service;

import com.murad.awwad.springbootwithangular.converter.UserConverter;
import com.murad.awwad.springbootwithangular.dto.UserDto;
import com.murad.awwad.springbootwithangular.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ma_ab on 3/21/2018.
 */

public interface UserService {

    UserDto getUserById(Integer userId);
    void saveUser(UserDto userDto);
    List<UserDto> getAllUsers();

    @Service
    public class UserServiceImpl implements UserService{
        @Autowired
        UserRepository userRepository;
        @Override
        public UserDto getUserById(Integer userId) {
            return UserConverter.entityToDto(userRepository.getOne(userId));
        }
        @Override
        public void saveUser(UserDto userDto) {
            userRepository.save(UserConverter.dtoToEntity(userDto));
        }
        @Override
        public List < UserDto > getAllUsers() {
            return userRepository.findAll().stream().map(UserConverter::entityToDto).collect(Collectors.toList());
        }
    }

}
