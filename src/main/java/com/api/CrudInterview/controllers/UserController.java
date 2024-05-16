package com.api.CrudInterview.controllers;

import com.api.CrudInterview.models.UserModels;
import com.api.CrudInterview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userservice;

    @GetMapping
    public ArrayList<UserModels> getUser(){
        return this.userservice.getUsers();
    }
    @PostMapping
    public UserModels saveUser(@RequestBody UserModels user){
        return this.userservice.saveUser(user);
    }
    @GetMapping(path = "/{id}")
    public Optional<UserModels> getUserById(@PathVariable("id") Long id){
        return this.userservice.getById(id);
    }
    @PutMapping
    public UserModels updateUserById(@RequestBody UserModels request,@PathVariable ("id") Long id){
        return this.userservice.updateById(request, id);
    }
    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.userservice.deleteUser(id);
        if(ok){
            return "User with id" + id + "Deleted!";
        }else {
            return "Error, with the id";
        }
    }
}
