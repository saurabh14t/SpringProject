package com.example.demo;

import com.example.demo.model.abcModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class abcController {

    @GetMapping("/abc")
    public ResponseEntity<Integer> abcxyz(){
        System.out.println("we were here");
        Integer output = abcModel.output();
        return new ResponseEntity<Integer>(output, HttpStatus.OK);
    }

    @PostMapping("/abc")
    public ResponseEntity<Integer> abcxyzpost(){
        System.out.println("we were here post");
        Integer output = abcModel.output();
        return new ResponseEntity<Integer>(output, HttpStatus.CREATED);
    }
}
