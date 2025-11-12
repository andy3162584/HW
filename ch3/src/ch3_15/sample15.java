package ch3_15;

public class sample15 {
    public static void main(String[] args) {
        Car.showSum();

        Car car1;
        car1 = new Car();
        car1.setCar(1234, 20.5);
        car1.show();

        Car.showSum();

        Car car2;
        car2 = new Car();
        car2.setCar(4567, 30.5);
        car2.show();
    }
}

class Car {
    public static int sum = 0;

    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        sum++;
        System.out.println("生產了第" + sum + "台");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
    }

    public static void showSum() {
        System.out.println("車子總共生產了" + sum + "台");
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}