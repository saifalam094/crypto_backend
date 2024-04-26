package com.example.demo.service;


import com.example.demo.entity.UserDetailsBo;
import com.example.demo.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
  private UserDetailsRepository userDetailsRepository;
  public ResponseEntity<String>submitFormData(UserDetailsBo userDetailsBo){
     try{
userDetailsRepository.save(userDetailsBo);
   return  new ResponseEntity<>("Form Data submitted successfully", HttpStatus.OK);
     }
     catch (Exception e){
return new ResponseEntity<>("Error while submitting the data",HttpStatus.INTERNAL_SERVER_ERROR);
     }
  }

}
