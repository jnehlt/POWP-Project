package pl.com.abstractcompany.powpproject.afactory.worker;

import pl.com.abstractcompany.powpproject.afactory.AbstractFactory;

public class WorkerFactory implements AbstractFactory<Worker> {
    @Override
    public Worker create(String type) {
        if ("freelancer".equalsIgnoreCase(type)) {
            return new Freelancer();
        } else if ("employee".equalsIgnoreCase(type)) {
            return new Employee();
        }
        return null;
    }
}
