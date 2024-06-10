package com.example.psychology_back.controller;

import com.example.psychology_back.dto.ListTestsDto;
import com.example.psychology_back.service.TestsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(value = "http://localhost:3000")
@RequiredArgsConstructor
public class TestsController {

    private final TestsService testsService;

    @GetMapping("/api/v1/tests")
    public ListTestsDto getTests() {
        return testsService.getTests();
    }

}
