package ch3_10;

public class sample10 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        car1.setNumGas(1234, 20.5);
        car1.show();

        System.out.println("將車號設為1234，汽油量設為20.5");

        car1.setNumGas(1234, -10.0);
        car1.show();
    }
}

class Car {
    private int num;
    private double gas;

    public void setNumGas(int n, double g) {
        if (g >= 0 && g <= 100) {
            num = n;
            gas = g;
            System.out.println("將車號設為" + num + "，汽油量設為" + gas);
        } else {
            System.out.println("不正確的汽油量：" + g);
            System.out.println("無法變更汽油量");
        }
    }

    public void show() {
        System.out.println("車號是" + this.num + "，汽油量是" + this.gas);
    }
}