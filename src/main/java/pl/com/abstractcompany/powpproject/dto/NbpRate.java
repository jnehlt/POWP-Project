package pl.com.abstractcompany.powpproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NbpRate {
    @JsonProperty("Mid")
    private float rate;
}
