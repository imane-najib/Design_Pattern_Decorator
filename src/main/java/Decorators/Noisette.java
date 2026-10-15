package Decorators;

import composants.Boisson;

public class Noisette extends Decorator {
    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+ " au noisette";
    }

    @Override
    public double cout() {
        return boisson.cout()+1.2;
    }
}
