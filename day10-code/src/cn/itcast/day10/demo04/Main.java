package cn.itcast.day10.demo04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        String s = in.next();
        StringBuilder S = new StringBuilder(s);
        StringBuilder T = new StringBuilder();
        if(t == 1){
            for(int i=0;i<n;i++){
                int length = S.length();
                if(length%2==1) length = length/2 + 1;
                T.append(S.charAt(length/2));
                S.deleteCharAt(length/2);
            }
        }else if(t == 2){
            for(int i=0;i<S.length();i++){
                if(i%2==0){
                    T.insert(0,S.charAt(i));
                }else{
                    T.append(S.charAt(i));
                }
            }
        }
        System.out.println(T.toString());
    }

}
