package ch3_13;

public class sample13
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();
        car1.show();

        Car car2;
        car2 = new Car(1234, 25.0);
        car2.show();
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
        System.out.println("產生了車子");
    }

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("產生了車子" + num + "號，汽油量是" + gas);
    }

    public void show()
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}