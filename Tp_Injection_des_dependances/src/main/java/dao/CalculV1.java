package dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CalculV1 implements ICalcul {
    @Override
    public double getValue() {
        double d=100;
        return d;
    }
}
