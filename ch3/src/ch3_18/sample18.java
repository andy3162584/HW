package ch3_18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class sample18
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("請輸入英文文字：");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String stru = str.toUpperCase();   // 將 str 轉成大寫放到 stru
        String strl = str.toLowerCase();   // 將 str 轉成小寫放到 strl

        System.out.println("轉換成大寫為：" + stru);
        System.out.println("轉換成小寫為：" + strl);
    }
}