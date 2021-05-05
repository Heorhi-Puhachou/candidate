package by.choice.candidate.controller;

import by.choice.candidate.dto.CandidateDto;
import by.choice.candidate.service.CandidateService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;


/**
 * @author Heorhi Puhachou
 */
@Validated
@RestController
@RequestMapping("api/user/point")
@Tag(name = "Інфармацыя аб кандыдатах", description = "Абпрацоўка і выдача інфармацыі аб кандыдатах")
public class CandidateController {

    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }


    @PutMapping(produces = APPLICATION_JSON_VALUE)
    @Operation(summary = "Дадаць інфармацыю аб кандыдаце", description = "Неабходна увясці імя і апісанне")
    public HttpStatus registerUser(@RequestBody CandidateDto candidateDto) {
        candidateService.addCandidateInformation();
        return HttpStatus.OK;
    }

    @GetMapping(value = "{key}", produces = APPLICATION_JSON_VALUE)
    @Operation(summary = "Получить пользователя")
    public ResponseEntity<CandidateDto> getSimpleDto(@PathVariable("key") String key) {
        return ResponseEntity.ok(candidateService.testGetCandidateInformation());
    }
}
