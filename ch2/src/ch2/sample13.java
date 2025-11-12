package ch2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class sample13
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("請問你在第幾次先猜對數字呢?(1~10)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        for (int i = 1; i <= 10; i++)
        {
            System.out.println("第" + i + "次的處理。");
            if (i == res)
                break;
        }
    }
}