package ch3_4;

import ch3_4.Car;

public class sample4
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();

        car1.num = 1234;
        car1.gas = 20.5;

        car1.show(); // 呼叫方法
        car1.show(); // 再一次呼叫方法
    }
}

class Car
{
    int num;
    double gas;

    void show() // 定義方法
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }
}