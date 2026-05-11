package br.com.paulocode.userserviceapi.service;

import br.com.paulocode.userserviceapi.entity.User;
import br.com.paulocode.userserviceapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User findById(final String id){
        return userRepository.findById(id).orElse(null);
    }
}
