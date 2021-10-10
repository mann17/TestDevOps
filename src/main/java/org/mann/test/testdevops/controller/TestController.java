package org.mann.test.testdevops.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@AllArgsConstructor
@Slf4j
public class TestController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        log.info("Saying Hello...");

        return ResponseEntity.ok("Hello There, welcome to the world of continuous learning...");
    }

}
