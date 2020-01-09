package pl.com.abstractcompany.powpproject.repository;

import org.springframework.stereotype.Repository;
import pl.com.abstractcompany.powpproject.model.Salary;

import java.math.BigDecimal;
import java.util.NoSuchElementException;

@Repository
//it's a mocked repository. We dont want to use any db or whatsoever - there is no need of that
public class SalariesRepository {
    public Salary getSalaryForProfileId(int id){
        BigDecimal salaryValue;
        switch (id){
            case 1:
                salaryValue = new BigDecimal(20000);
                break;
            case 2:
                salaryValue = new BigDecimal(2000);
                break;
            case 3:
                salaryValue = new BigDecimal(5000);
                break;
            default:
                throw new NoSuchElementException();
        }
        return new Salary(id, salaryValue);
    }
}
