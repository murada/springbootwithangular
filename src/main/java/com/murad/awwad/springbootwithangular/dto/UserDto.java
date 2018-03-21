package com.murad.awwad.springbootwithangular.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ma_ab on 3/21/2018.
 */
public class UserDto {
    Integer userId;
    String userName;
    List<SkillDto> skillDtos= new ArrayList<>();
    public UserDto(Integer userId, String userName, List<SkillDto> skillDtos) {
        this.userId = userId;
        this.userName = userName;
        this.skillDtos = skillDtos;
    }
    public UserDto() {
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public List<SkillDto> getSkillDtos() {
        return skillDtos;
    }
    public void setSkillDtos(List<SkillDto> skillDtos) {
        this.skillDtos = skillDtos;
    }

}
