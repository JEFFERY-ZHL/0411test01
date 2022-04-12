package cn.itcast.day02.demo2;

public class Array01 {
    public static void main(String[] args) {


        int[] arrayC = new int[] {5,15,25,50,26,5,84,16,48,516,48,96,12};
        int len = arrayC.length;
        int i, a ;

        for(i = 0;i<(len / 2);i++){
            a = arrayC[len-1-i];
            arrayC[len-1-i] = arrayC[i];
            arrayC[i] = a;
        }
        for (int i1 = 0; i1 < arrayC.length; i1++) {
            System.out.println(arrayC[i1]);

        }
        }

        //}

    }


