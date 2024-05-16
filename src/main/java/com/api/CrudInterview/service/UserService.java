package com.api.CrudInterview.service;

import com.api.CrudInterview.models.UserModels;
import com.api.CrudInterview.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;

    public ArrayList<UserModels> getUsers(){
        return (ArrayList<UserModels>) userRepository.findAll();
    }
    public UserModels saveUser(UserModels user){
        return userRepository.save(user);
    }
    public Optional<UserModels> getById(Long id){
        return userRepository.findById(id);
    }
    public UserModels updateById(UserModels request, Long id){
        UserModels user = userRepository.findById(id).get();
        user.setNombreDeUsuario(request.getNombreDeUsuario());
        user.setApellidoDeUsuario(request.getApellidoDeUsuario());
        user.setEdad(request.getEdad());
        user.setDocumentoDeIdentidad(request.getDocumentoDeIdentidad());
        return user;
    }
    public Boolean deleteUser(Long id){
        try {
            userRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
