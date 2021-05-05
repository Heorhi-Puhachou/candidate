package by.choice.candidate.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

/**
 * @author upagge 30.12.2020
 */
@Schema(description = "Кандыдат")

public class CandidateDto {

    @Schema(description = "Айдзішка", accessMode = Schema.AccessMode.READ_ONLY)
    private String key;

    @Schema(description = "Поўнае імя", example = "Падаслаў Жыгімонтавіч Радзівіл")
    private String name;

    @Schema(description = "Час стварэння запісу", accessMode = Schema.AccessMode.READ_ONLY)
    private LocalDateTime regDate = LocalDateTime.now();

    public CandidateDto() {
    }

    public CandidateDto(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public static CandidateDto of(String key, String value) {
        return new CandidateDto(key, value);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }
}
