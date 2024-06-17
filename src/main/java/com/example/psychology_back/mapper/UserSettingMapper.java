package com.example.psychology_back.mapper;

import com.example.psychology_back.dto.UserSettingDto;
import com.example.psychology_back.entity.UserSetting;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserSettingMapper {

    UserSettingMapper INSTANCE = Mappers.getMapper(UserSettingMapper.class);

    UserSettingDto userSettingToUserSettingDto(UserSetting userSetting);

    UserSetting userSettingDtoToUserSetting(UserSettingDto userSettingDto);

}
