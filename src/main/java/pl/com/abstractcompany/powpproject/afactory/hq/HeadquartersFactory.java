package pl.com.abstractcompany.powpproject.afactory.hq;

import pl.com.abstractcompany.powpproject.afactory.AbstractFactory;
import pl.com.abstractcompany.powpproject.afactory.worker.Employee;
import pl.com.abstractcompany.powpproject.afactory.worker.Freelancer;
import pl.com.abstractcompany.powpproject.afactory.worker.Worker;

public class HeadquartersFactory implements AbstractFactory<Headquarters> {
    @Override
    public Headquarters create(String type) {
        if ("office".equalsIgnoreCase(type)) {
            return new Office();
        } else if ("warehouse".equalsIgnoreCase(type)) {
            return new Warehouse();
        }
        return null;
    }
}
