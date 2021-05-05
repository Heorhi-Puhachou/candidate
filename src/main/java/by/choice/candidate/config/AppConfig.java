package by.choice.candidate.config;


import by.choice.candidate.dto.CandidateDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 */
@Configuration
public class AppConfig {

    @Bean
    public Map<String, CandidateDto> testRepository() {
        return Stream.of(
                CandidateDto.of("key1", "value1"),
                CandidateDto.of("key2", "value2")
        ).collect(Collectors.toMap(CandidateDto::getKey, userDto -> userDto));
    }

}
