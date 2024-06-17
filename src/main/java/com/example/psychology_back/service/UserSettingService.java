package com.example.psychology_back.service;

import com.example.psychology_back.dto.UserSettingDto;
import com.example.psychology_back.entity.UserSetting;
import com.example.psychology_back.mapper.UserSettingMapper;
import com.example.psychology_back.repository.UserSettingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserSettingService {

    private final UserSettingRepository userSettingRepository;


    public UserSettingDto getUserSetting() {
        UserSetting userSetting = userSettingRepository.findAll().stream().findAny().orElse(null);
        return UserSettingMapper.INSTANCE.userSettingToUserSettingDto(userSetting);
    }

    public UserSettingDto setUserSetting(UserSettingDto userSettingDto) {
        UserSetting userSetting = UserSettingMapper.INSTANCE.userSettingDtoToUserSetting(userSettingDto);
        userSetting.setId(1L);
        userSettingRepository.save(userSetting);
        return UserSettingMapper.INSTANCE.userSettingToUserSettingDto(userSetting);
    }

}
