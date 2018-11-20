package ru.zhugin.se;

public abstract class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }

    protected int runLimit;
    protected int swimLimit;
    protected float jumpLimit;

    public abstract void run(int length);
    public abstract void swim(int length);
    public abstract void jump(float height);

    public static void main(String[] args) {
        Cat tom = new Cat("Tom");
        Dog spike = new Dog("Spike");

        tom.run(250);
        spike.run(350);

        tom.jump(1.5f);
        spike.jump(2.5f);

        tom.swim(100);
        spike.swim(20);
    }
}
