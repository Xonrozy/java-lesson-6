package ru.zhugin.se;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        super.runLimit = 200;
        super.jumpLimit = 2;
        swimLimit = 0;
    }

    @Override
    public void run(int length) {
        if (runLimit > 0) {
            System.out.println(
                    name + " run: " + (length < runLimit) + " (дистанция: " + length + ", может пробежать: " + runLimit + ")");
        } else {
            System.out.println(name + " не умеет бегать!");
        }
    }

    @Override
    public void swim(int length) {
        if (swimLimit != 0) {
            System.out.println(name + " swim: " + (length < swimLimit) + " (дистанция: " + length + ", может проплыть: " + swimLimit + ")");
        } else {
            System.out.println(name + " не умеет плавать!");
        }

    }

    @Override
    public void jump(float height) {
        if (jumpLimit > 0) {
            System.out.println(name + " jump: " + (height < jumpLimit) + " (высота: " + height + ", может перепрыгнуть: " + jumpLimit + ")");
        } else {
            System.out.println(name + " не умеет прыгать!");
        }
    }
}
