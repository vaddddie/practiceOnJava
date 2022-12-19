package ru.mirea.lab24.ex1;

public class ConcreteFactory implements ComplexAbstractFactory {
    private final int real;
    private final int image;

    public ConcreteFactory() {
        this.real = 0;
        this.image = 0;
    }

    public ConcreteFactory(int real, int image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public Complex createComplex() {
        return new Complex(real, image);
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
}