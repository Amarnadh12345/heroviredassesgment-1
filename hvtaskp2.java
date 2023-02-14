import java.util.*;
public class hvtaskp2 {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.println("enter length of the array");//length of array
        int num=scr.nextInt();
        System.out.println("enter array elements");
        int arr[]= new int[num];
        for(int j=0;j<num;j++){
            arr[j]=scr.nextInt();
        }
        Arrays.sort(arr);
        System.out.printf("unique elements in array are : ");
        for(int i=0;i<num;i++){
            if(arr[i]!=-1){
                
                for(int j=i;j<num;j++){
                    if(i!=j && arr[i]==arr[j]){
                       arr[j]=-1; 
                    }
                    
                }
                System.out.printf(arr[i]+" ");
            }
        }
    }
}
