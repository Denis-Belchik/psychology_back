package com.example.psychology_back.mapper;

import com.example.psychology_back.dto.ListTestsDto;
import com.example.psychology_back.dto.TestDto;
import com.example.psychology_back.entity.Test;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TestMapper {
    TestMapper INSTANCE = Mappers.getMapper(TestMapper.class);

    @Mapping(target = "title", source = "title")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "instructions", source = "instructions")
    TestDto testToTestDto(Test entity);


    List<TestDto> testsToTestDtos(List<Test> entities);

    default ListTestsDto testDtosToListTestsDto(List<Test> entities){
        ListTestsDto listTestsDto = new ListTestsDto();
        listTestsDto.setTests(testsToTestDtos(entities));
        return listTestsDto;
    }

}
