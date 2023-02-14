import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class hvtaskp3 {

    static Scanner scr = new Scanner(System.in);
    static int productCount[]={20,5,40,90};
    static String Products[] ={"mobiles","speakers","headphones","pcs"};
    static int ProductsCost[]={14000,3456,567,100000};
    static String productsSpecifications[]={
        "5g ,12gb ram , 128gb rom ","bluetooth 5.0 ,5A charging","bluetooth 5.0, wired or bluetooth"," Intel i5 processor, 16 gb ram,512 gb rom"};
        static String Details[]={
            "product list","product count","view product details","update product specifications","edit product quantity"
        };
        
        static void editCount(int n){
            System.out.println();
            System.out.println("enter product count");
            int c;//count variable
            c=scr.nextInt();
            productCount[n-1]=c;
        }

        // edit product details 


        static void editProductDetails(){
            for(int j=0;j<4;j++){
                System.out.println((j+1)+" "+Products[j]);
            }
            int r;
            String str;
            System.out.println("select product optiion");
            r=scr.nextInt();
            scr.nextLine();
            System.out.println("Eneter the specifications");
            str=scr.nextLine();
            productsSpecifications[r-1]=str;
        }

        // to display the count in menu
        static void Show(int n){
            System.out.println();
            if((n-1)==0){
                for( int i=0;i<4;i++){
                    System.out.println((i+1)+" ."+Products[i]);
                }
            }
            else if((n-1)==1){
                for(int i=0;i<4;i++){
                    System.out.println((i+1)+" ."+Products[i]+" - available items : "+productCount[i]);
                }
            }
            else if((n-1)==2){
                for(int i=0;i<4;i++){
                    System.out.println((i+1)+" ."+Products[i]);
                }
                int r;
                System.out.println("Select The Product option to get Details");
                r=scr.nextInt();
                System.out.println();
                System.out.println(Products[r-1]+"\n"+productsSpecifications[r-1]+"\neach Item Costs Rs."+ProductsCost[r-1]+"\navailable Items- "+productCount[r-1]);
            }
            else if((n-1)==3){
                editProductDetails();
            }
            else if((n-1)==4){
                System.out.println();
                for(int i=0;i<4;i++){
                    System.out.println((i+1)+". "+Products[i]+" - available Items : "+productCount[i]);
                }
                System.out.println();
                System.out.println("Select Any Option from above List of product to update ");
                int r;
                r=scr.nextInt();
                editCount(r);
                System.out.println("quantity is updated");
            }
            if(Continue()) {
                System.out.println();
                for (int i=0;i<5;i++){
                    System.out.println((i+1)+". "+Details[i]);
                }
                System.out.println();
                System.out.println("Select Any Option from above List");
                n=scr.nextInt();
                Show(n);
            }
            else return;
    
        }

       //to display list of menu 
       static void display(){
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.println((i+1)+" ."+Details[i]);
        }
        if(Continue()){
            System.out.println();
            System.out.println("selsect any option from above list");
            int num=scr.nextInt();
            Show(num);
        }
        else return;
       } 
       // to continue or  to stop prcocess
       static boolean Continue(){
        System.out.println();
        char ch;
        System.out.println("press any key to continue or n to stop");
        ch=scr.next().charAt(0);
        if(ch=='n') return false;
        else{
            return true;
        }
       }

    public static void main(String[] args) {
        display();
   } 
}
