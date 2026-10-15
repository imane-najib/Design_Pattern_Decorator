package Decorators;

import composants.Boisson;

public class Caramel extends Decorator {
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+ " au caramel";
    }

    @Override
    public double cout() {
        return boisson.cout()+0.8;
    }
}
