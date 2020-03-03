package com.company.HomeWork05;

public class Counter {
    private int value;
    private int step;
    int result;

    public Counter() {
        this.value = 0;
        this.value = 1;
    }

    public void increment() {
      value+=step;
        if (value > 100) {
            clear();
        }
    }

    public void decrement() {
        value-=step;
        if (value < 0) {
            clear();
        }
    }

    public void clear() {
        this.value = 0;
        this.value = 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
}

class CounterDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.getValue();
        counter.getStep();

        counter.increment();

        counter.getValue();

        counter.setStep(5);

        counter.increment();

        counter.setStep(2);

        counter.decrement();

        System.out.println(counter.getValue());
        System.out.println(counter.getStep());
    }
}
