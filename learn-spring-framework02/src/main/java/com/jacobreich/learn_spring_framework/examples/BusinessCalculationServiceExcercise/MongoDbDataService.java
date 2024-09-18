package com.jacobreich.learn_spring_framework.examples.BusinessCalculationServiceExcercise;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Component
@Primary
public class MongoDbDataService implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[] {8, 4, 1, 2, 5, 99};
    }
}
