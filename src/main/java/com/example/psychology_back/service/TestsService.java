package com.example.psychology_back.service;

import com.example.psychology_back.dto.ListTestsDto;
import com.example.psychology_back.entity.Test;
import com.example.psychology_back.mapper.TestMapper;
import com.example.psychology_back.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestsService {

    private final TestRepository testRepository;

    public ListTestsDto getTests() {
        List<Test> tests = testRepository.findAll();
        ListTestsDto listTestsDto = TestMapper.INSTANCE.testDtosToListTestsDto(tests);
        return listTestsDto;
    }
}
