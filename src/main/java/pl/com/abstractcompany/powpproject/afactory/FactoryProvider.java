package pl.com.abstractcompany.powpproject.afactory;

import pl.com.abstractcompany.powpproject.afactory.hq.HeadquartersFactory;
import pl.com.abstractcompany.powpproject.afactory.worker.WorkerFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){

        if("worker".equalsIgnoreCase(choice)){
            return new WorkerFactory();
        }
        else if("Color".equalsIgnoreCase(choice)){
            return new HeadquartersFactory();
        }

        return null;
    }
}
