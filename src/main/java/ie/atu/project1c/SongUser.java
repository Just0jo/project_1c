package ie.atu.project1c;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Valid
@NoArgsConstructor
@AllArgsConstructor
public class SongUser {

    @Max(value = 9, message = "id cannot be greater than 8")
    private String id;

    @NotBlank(message = "SongTitle_1 is required")
    private String SongTitle_1;

    @NotBlank(message = "SongTitle_2 is required")
    private String SongTitle_2;

    @NotBlank(message = "SongTitle_3 is required")
    private String SongTitle_3;

    @NotBlank(message = "SongTitle_4 is required")
    private String SongTitle_4;
}