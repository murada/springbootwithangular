package com.murad.awwad.springbootwithangular.converter;

import com.murad.awwad.springbootwithangular.dto.UserDto;
import com.murad.awwad.springbootwithangular.entity.User;

import java.util.stream.Collectors;

/**
 * Created by ma_ab on 3/21/2018.
 */
public class UserConverter {

    public static User dtoToEntity(UserDto userDto){
        User user = new User(userDto.getUserName(),null);
        user.setUserId(userDto.getUserId());
        user.setSkills(userDto.getSkillDtos().stream().map(SkillConverter::dtoToEntity).collect(Collectors.toList()));
        return user;
    }


    public static UserDto entityToDto(User user) {
        UserDto userDto = new UserDto(user.getUserId(), user.getUserName(), null);
        userDto.setSkillDtos(user.getSkills().stream().map(SkillConverter::entityToDto).collect(Collectors.toList()));
        return userDto;
    }


}
