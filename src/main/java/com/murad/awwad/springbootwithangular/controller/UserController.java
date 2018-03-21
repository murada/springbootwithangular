package com.murad.awwad.springbootwithangular.controller;

import com.murad.awwad.springbootwithangular.dto.UserDto;
import com.murad.awwad.springbootwithangular.service.UserService;
import com.murad.awwad.springbootwithangular.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ma_ab on 3/21/2018.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(Constants.GET_USER_BY_ID)
    public UserDto getUserById(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }

    @RequestMapping(Constants.GET_ALL_USERS)
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }



    @RequestMapping(value = Constants.SAVE_USER, method = RequestMethod.POST)
    public void saveUser(@RequestBody UserDto userDto){
        userService.saveUser(userDto);
    }
}
