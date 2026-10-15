import Decorators.Caramel;
import Decorators.Chocolat;
import Decorators.Noisette;
import composants.Boisson;
import composants.Sumatra;

public class Test {

    public static void main(String[] args) {
        Boisson boisson;
        boisson = new Sumatra();

        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-----------------------------");

        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-----------------------------");

        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("-----------------------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("-----------------------------");
        boisson = new Noisette(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
    }
}
