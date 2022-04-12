package cn.itcast.day10.demo04;

public class bilibili {
    public static void main(String[] args) {
        int[] nums = new int[]{5,6,7,8,74,20,6,4,9,55,986,79};
        int low=0,high=nums.length-1;
        quickSort(low, high, nums);

        for(int i:nums){
            System.out.println(i);
        }
    }
    public static void quickSort(int i, int j, int[] num){
        int low, high, temp;
        if(i>j) return ;

        low = i;
        high = j;
        temp = num[low];

        while(low<high){
            while(num[high] >= temp && low < high) high--;
            while(num[low] <= temp && low < high) low++;

            if(low<high){
                swan(low,high,num);
            }


        }
        num[low] = num[high];
        num[high] = temp;

        quickSort(i,high-1,num);
        quickSort(high+1,j,num);
    }
    private static void swan(int i, int j, int[] num){
        int pre = num[i];
        num[i] = num[j];
        num[j] = pre;
    }

}
