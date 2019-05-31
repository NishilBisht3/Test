package com.cosmin.tutorials.apm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @GetMapping("/{id}")
    public String get(@PathVariable("id") Integer id) {
        return "Hello";
    }

    @PostMapping("")
    public String create(@PathVariable("id") Integer id) {
        return "Bye";
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") Integer id) {

        return new ResponseEntity(HttpStatus.OK);
    }
}
