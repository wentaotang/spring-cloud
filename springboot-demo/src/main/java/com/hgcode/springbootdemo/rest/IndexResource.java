package com.hgcode.springbootdemo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexResource {

    @GetMapping("/index")
    public ResponseEntity<String> index(){
        return ResponseEntity.ok().body("hello word");
    }
}
