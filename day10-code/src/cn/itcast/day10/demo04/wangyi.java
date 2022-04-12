

public class wangyi {
    public static void main(String[] args) {
        char[] input = {'a','b','c',' ','b','c','d',' ','e','f','g'};

        System.out.println(reverse(input));
    }
    public static char[] reverse(char[] input){
        int n = input.length;
        char[] temp = new char[n];
        int j = n - 1;
        int last = 0;
        for(int i = 0 ; i < n ; i++){
            if(input[i] != ' '){
                continue;
            }
            int templength = i-last+1;
            j = j - templength;
            while (templength != 0){
                temp[j++] = input[last++];
            }
            j = j - templength;
        }
        return temp;
    }
}