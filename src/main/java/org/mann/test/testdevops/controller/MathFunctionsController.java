package org.mann.test.testdevops.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mann.test.testdevops.service.MathsFunctionsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mf")
@AllArgsConstructor
@Slf4j
public class MathFunctionsController {

    private final MathsFunctionsService mathsFunctionsService;

    @GetMapping("/isEvenOdd")
    public ResponseEntity<String> isEvenOddNumber(@RequestParam Integer number) {
        log.info("Checking even-odd for: {}", number);

        return ResponseEntity.ok(mathsFunctionsService.isEvenOddNumber(number));
    }

    @GetMapping("/isPrime")
    public ResponseEntity<String> isPrimeNumber(@RequestParam Integer number) {
        log.info("Checking if prime number for: {}", number);

        return ResponseEntity.ok(mathsFunctionsService.isPrimeNumber(number));
    }

    @GetMapping("/highestPrimeNumber")
    public ResponseEntity<Integer> getHighestPrimeNumber(@RequestParam Integer number) {
        log.info("Checking highest prime number for: {}", number);

        return ResponseEntity.ok(mathsFunctionsService.getHighestPrimeNumber(number));
    }

    @GetMapping("/factorial")
    public ResponseEntity<Integer> getFactorial(@RequestParam Integer number) {
        log.info("Calculating factorial value for: {}", number);

        return ResponseEntity.ok(mathsFunctionsService.getFactorial(number));
    }

    @GetMapping("/reverseString")
    public ResponseEntity<String> getReversedString(@RequestParam String string) {
        log.info("Evaluating reversed value for: {}", string);

        return ResponseEntity.ok(mathsFunctionsService.getReversedString(string));
    }

}
