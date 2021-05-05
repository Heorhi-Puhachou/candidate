package by.choice.candidate.service;

import by.choice.candidate.dto.CandidateDto;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Service
public class CandidateService {
    public void addCandidateInformation() {

    }

    public CandidateDto testGetCandidateInformation() {
        CandidateDto candidate = new CandidateDto();
        candidate.setName("test");
        return candidate;
    }
}
