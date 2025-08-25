package com.research.notes.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@AllArgsConstructor
@RequestMapping("/v1")
@Slf4j
public class QuestionController {
    @GetMapping("/question/{id}")
    public ResponseEntity<String> generate(
            @PathVariable String id) {
        return new ResponseEntity<>(id, HttpStatus.ACCEPTED);
    }
}
