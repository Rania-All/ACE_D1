package metier;

import dao.ICalcul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("gestion")
public class Gestion implements IGestion{
    @Autowired
    @Qualifier("cal2")
    ICalcul cal;
    @Override
    public double calcul() {
       double sum=cal.getValue()*100;
       return sum;
    }
    public void setCal(ICalcul cal) {
        this.cal = cal;
    }
}
