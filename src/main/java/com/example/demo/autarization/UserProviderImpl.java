package com.example.demo.autarization;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;

@Component
//@RequiredArgsConstructor
public class UserProviderImpl implements UserProvider {

    private final UserRepository userRepository;

    public UserProviderImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @SneakyThrows
    public UserEntity getCurrentUser() {

        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("user.yaml");

        CurrentUserConfig config = yaml.loadAs(inputStream, CurrentUserConfig.class);
        return userRepository.get(config.getId());
    }
}
