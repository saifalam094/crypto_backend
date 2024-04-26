package com.example.demo.controller;
import com.example.demo.entity.UserDetailsBo;
import com.example.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class UserDetailsController {
    @Autowired
  private UserServiceImpl userService;
    @PostMapping("/")
   public ResponseEntity<String> submitForm(@RequestBody UserDetailsBo userDetailsBo){
        System.out.println("Wellcome "+userDetailsBo);
        System.out.println("hello");
     return userService.submitFormData(userDetailsBo);
   }
   @GetMapping("/")
   public String myfunc(){
        return "welcome to login from backend controller";
   }
}
