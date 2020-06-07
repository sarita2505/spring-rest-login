package com.spring.controller;

import com.spring.model.LoginUser;
import com.spring.service.ILoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LoginUserController {
    @Autowired
    private  ILoginUserService<LoginUser,Integer> service;
    @PostMapping("/login")
    public  ResponseEntity<LoginUser> save(@RequestBody LoginUser loginUser){
        service.create(loginUser);
        return ResponseEntity.status(200).body(loginUser);
    }
    @PutMapping("/login/{id}")
    public  ResponseEntity<Integer> update(@PathVariable("id")int id, @RequestBody LoginUser loginUser){
        int i=0;
        i=service.update(loginUser,id);
        return ResponseEntity.status(200).body(i);
    }
    @DeleteMapping("/login/{id}")
    public  ResponseEntity<Integer> delete(@PathVariable("id")int id){
        int i=0;
        i=service.delete(id);
        return ResponseEntity.status(200).body(i);
    }
    @GetMapping("/login/{id}")
    public  ResponseEntity<LoginUser> getById(@PathVariable("id")int id){
        LoginUser loginUser=new LoginUser();
        loginUser=service.findById(id);
        return ResponseEntity.status(200).body(loginUser);
    }
    @GetMapping("/login")
    public  ResponseEntity<List<LoginUser>> selectAll(){
        List<LoginUser> userList=new ArrayList<>();
        userList=service.findAll();
        return ResponseEntity.status(200).body(userList);
    }
}
