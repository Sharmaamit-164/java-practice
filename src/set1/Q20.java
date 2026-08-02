package set1;

public class Q20 {
    public static void main(String[]args){
        int[] arr = {10,55,60,8,15};
        int max =arr[0];
        for(int i=0; i<5;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max num is : " +max);
    }
}
