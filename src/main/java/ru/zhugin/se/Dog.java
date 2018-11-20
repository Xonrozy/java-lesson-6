package ru.zhugin.se;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        super.runLimit = 500;
        super.jumpLimit = 0.5f;
        super.swimLimit = 10;
    }

    @Override
    public void run(int length) {
        if (runLimit > length) {
            System.out.println(name + " run: " + (length < runLimit) + " (дистанция: " + length + ", может пробежать: " + runLimit + ")");
        } else {
            System.out.println(name + " не пробежит данную дистанцию!");
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

    @Override
    public void swim(int length) {
        if (swimLimit > 0) {
            System.out.println(name + " swim: " + (length < swimLimit) + " (дистанция: " + length + ", может проплыть: " + swimLimit + ")");
        } else {
            System.out.println(name + " не умеет плавать!");
        }
    }
}
