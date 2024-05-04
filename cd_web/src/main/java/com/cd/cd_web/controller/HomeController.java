package com.cd.cd_web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public void home(){

    }
    @RequestMapping("/api1")
    public ResponseEntity api1(){
        return new ResponseEntity<>("api1입니다.", HttpStatus.OK);
    }

    @RequestMapping("/api2")
    public ResponseEntity api2(){
        return new ResponseEntity<>("api1입니다.", HttpStatus.OK);
    }

    @RequestMapping("/user")
    public ResponseEntity user(@AuthenticationPrincipal UserDetails userDetails){
        return new ResponseEntity<>(userDetails.getUsername(), HttpStatus.OK);
    }
}
