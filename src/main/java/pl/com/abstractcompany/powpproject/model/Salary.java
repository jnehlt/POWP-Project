package pl.com.abstractcompany.powpproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Salary {
    private int profileId;
    private BigDecimal grossSalary;
}
