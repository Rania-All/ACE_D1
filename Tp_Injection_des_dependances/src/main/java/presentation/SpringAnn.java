package presentation;

import dao.ICalcul;
import metier.IGestion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnn {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("dao","metier");
         ICalcul cal=context.getBean(ICalcul.class);
        System.out.println(cal.getValue());
        IGestion gestion = (IGestion) context.getBean(IGestion.class);
        System.out.println(gestion.calcul());
    }
}
