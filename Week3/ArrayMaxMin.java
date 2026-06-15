package Week3;

public class ArrayMaxMin {
    static void main(String[] args) {
        int[] numbers={5,12,3,19,8,2};
        int max=2;
        int min=5;
        for(int val:numbers){
            if (max<val){
                max=val;
            }
            if(min>val){
                min=val;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

}
