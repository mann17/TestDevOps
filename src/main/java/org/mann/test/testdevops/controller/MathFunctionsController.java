package org.mann.test.testdevops.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mann.test.testdevops.service.MathsFunctionsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mf")
@AllArgsConstructor
@Slf4j
public class MathFunctionsController {

    private final MathsFunctionsService mathsFunctionsService;

    @GetMapping("/isEvenOdd")
    public ResponseEntity<String> isEvenOddNumber(Integer number) {
        log.info("Checking even-odd for: {}", number);

        return ResponseEntity.ok(mathsFunctionsService.isEvenOddNumber(number));
    }

}