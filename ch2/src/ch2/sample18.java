package ch2;

public class sample18
{
    public static void main(String[] args)
    {
        int[] test = {80, 60, 22, 50, 75};  // 陣列的初始化

        for (int i = 0; i < 5; i++)
        {
            System.out.println("第" + (i+1) + "個人的分數是" + test[i] + "分");
        }
    }
}