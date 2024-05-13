package com.example.lab2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  @GetMapping("/getInfomation")
    public ResponseEntity<?> doGetInfomation(@RequestParam ("Ten")String name,
                                        @RequestParam ("Tuoi")String age) {
        Map<String, String> result = new HashMap<>();
        result.put("Ten", name);
        result.put("Tuoi", age);
        result.put("Lop", "Java5");
        return ResponseEntity.ok(result);
}
