package ch3_19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class sample19 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入字串:");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();

        System.out.println("請輸入要搜尋的字元:");
        String str2 = br.readLine();
        char ch = str2.charAt(0);

        int num = str1.indexOf(ch);

        if (num != -1)
            System.out.println(str1 + "的第" + (num + 1) + "個字元是" + ch + "。");
        else
            System.out.println(str1 + "中沒有" + ch + "這個字元。");
    }
}