package ru.geekbrains.calc;

public class CalculableFactory implements ICalculableFactory{

    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
