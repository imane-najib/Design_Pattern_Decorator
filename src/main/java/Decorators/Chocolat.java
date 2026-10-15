package Decorators;

import composants.Boisson;

public class Chocolat extends Decorator {
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+ " au chocolat";
    }

    @Override
    public double cout() {
        return boisson.cout()+1.2;
    }
}
