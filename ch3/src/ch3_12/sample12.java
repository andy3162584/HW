package ch3_12;

public class sample12
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();

        car1.show();
    }
}

class Car
{
    private int num;
    private double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("生產了量子");
    }

    public void show()
    {
        System.out.println("量號是" + num);
        System.out.println("汽油量是" + gas);
    }
}