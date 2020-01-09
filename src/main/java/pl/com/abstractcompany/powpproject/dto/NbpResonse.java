package pl.com.abstractcompany.powpproject.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class NbpResonse {
    @JsonProperty("Rates")
    private List<NbpRate> rates;
}
