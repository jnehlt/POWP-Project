package pl.com.abstractcompany.powpproject.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.com.abstractcompany.powpproject.dto.NbpResonse;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class NbpApiAdapterService {

    public BigDecimal getEURsalary(BigDecimal salary){
        RestTemplate restTemplate = new RestTemplate();
        var nbpResponse = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/a/eur/", NbpResonse.class);
        var currentEurRate = nbpResponse.getRates().get(0).getRate();
        return salary.divide(new BigDecimal(currentEurRate), RoundingMode.HALF_UP);
    }
}
