package presentation;

import dao.ICalcul;
import metier.IGestion;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Instanciationdynamique {
    public static void main(String[] args)throws Exception {
        Scanner scanner = new Scanner(new File("Config.txt"));
        String cCalcul=scanner.nextLine();
        Class CalculClass=Class.forName(cCalcul);
        ICalcul calcul=(ICalcul)CalculClass.getConstructor().newInstance();
        System.out.println(calcul.getValue());
        String cGestion=scanner.nextLine();
        Class GestionClass=Class.forName(cGestion);
        IGestion gestion=(IGestion)GestionClass.getConstructor().newInstance();
        Method m=GestionClass.getMethod("setCal",ICalcul.class);
        m.invoke(gestion,calcul);
        System.out.println(gestion.calcul());
    }
}
