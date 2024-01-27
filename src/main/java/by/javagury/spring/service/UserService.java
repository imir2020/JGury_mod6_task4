package by.javagury.spring.service;

import by.javagury.spring.database.repository.UserRepository;
import by.javagury.spring.dto.UserDto;
import by.javagury.spring.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Optional;

@RequiredArgsConstructor
@ToString
public class UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public Optional<UserDto> findById(Long id){
        return userRepository.findById(id).map(userMapper::userToDto);
    }

}
