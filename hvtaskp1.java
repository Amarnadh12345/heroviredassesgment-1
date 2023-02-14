import java.util.Scanner;
public class hvtaskp1 {
    public  static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        int  num;
        
        System.out.println("eneter size of the array");
        num=sc.nextInt();
        int arr[]= new int[num];
        System.out.println("enter elements");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.printf("Missing elemets are ");
        for(int i=1;i<arr[num-1];i++){
            int c=0;
            for(int j=0;j<num;j++){
                if(i==arr[j]) 
                c=1;
            }
            if(c==0){
                System.out.printf(i+ " ");
            }
        }
    }
}
