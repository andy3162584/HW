package ch3_20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class sample20
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("請輸入字串：");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();

        System.out.println("請輸入要結合的字串：");
        String str2 = br.readLine();

        StringBuffer sb = new StringBuffer(str1);
        sb.append(str2);

        System.out.println("在「" + str1 + "」後面接上「" + str2 + "」的字串為：" + sb);
    }
}