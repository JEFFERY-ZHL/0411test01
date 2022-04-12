package cn.itcast.day10.demo04;

import java.util.Scanner;

public class bytedance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr1 = new int[2][n];
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[][] arr2 = new int[2][m];
        for(int i=0;i<2;i++){
            for(int j=0;j<m;j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        StringBuilder res = new StringBuilder();
        int cur = 0;
        int zhekou = 0;
        for(int i=0;i<n;i++){
            cur += arr1[0][i];
            zhekou += arr1[1][i];
            int manjian = cur;
            for(int j=0;j<m;j++){
                if(cur >= arr2[0][j]){
                    manjian = Math.min(cur - arr2[1][j], manjian);
                }
            }
            if(manjian == zhekou){
                res.append('B');
            }else if(manjian > zhekou){
                res.append('Z');
            }else {
                res.append('M');
            }
        }
        System.out.println(res.toString());
    }
}
