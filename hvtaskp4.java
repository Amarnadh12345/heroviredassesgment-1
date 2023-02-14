import java.util.*;

class product{
    double cost;
    int count;
    String specification;
    String productname;
    product(String name,String specifications,double cost,int count){
        this.cost=cost;
        this.count=count;
        this.productname=name;
        this.specification=specifications;
    }
    public int ProductCount(){
        return this.count;
    }
    public void ProductDetails(){
        System.out.println("Product name:"+this.productname);
        System.out.println("product specifications:"+this.specification);
        System.out.println("product cost:"+this.cost);
        System.out.println("product count:"+this.count);
        System.out.println();
    }
    public void editproductname(String name){
        this.productname=name;
    }
    public String getProduct(){
        return this.productname;
    }
    public void editOrUpdate(int count){
        this.count=count;
    }
    public void editOrUpdate(double cost){
        this.cost=cost;
    }
}   
public class hvtaskp4 {
    static Scanner scr = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("no of products\n");
        int num=scr.nextInt();
        scr.nextLine();
        List<product>list = new ArrayList<product>();
        System.out.println(" Enter details of product with name in one line seperated with spaces\n");
        for(int i=0;i<num;i++){
            System.out.println("Enter product name,specification,cost,count:\n");
            String t=scr.nextLine();
            String []arr=t.split("");
            String name=arr[0];
            String spec=arr[1];
            double cost=Double.parseDouble(arr[2]);
            int count=Integer.parseInt(arr[3]);
            product p1= new product(name, spec, cost, count);
            list.add(p1);
            System.out.println();
        }
        boolean f = true;
        while(f != false) {
            System.out.println("	1.Product List  ");
            System.out.println("	2.Product count ");
            System.out.println("	3.Product details ");
            System.out.println("	4.Edit product details ");
            System.out.println("	5.Update Inventory ");
            System.out.println("	6.Exit");
            System.out.println("	Enter your choice ");
            int choice = scr.nextInt();
            if(choice == 1) {
                productList(list);
            }else if(choice == 2) {
                productcount(list);
            }else if(choice == 3) {
                productdetails(list);
            }else if(choice == 4) {
                editproduct(list);
            }else if(choice == 5) {
                updateInventory(list);
            }else if(choice  == 6) {
                f = false;
            }else {
                System.out.println("Enter choice between 1 - 6 ");
            }

        }
        scr.close();
    }
    public static void editproduct(List<product> list) {
        System.out.println("Enter product name : ");
        scr.nextLine();
        String pname = scr.nextLine();
        for(product p: list) {
            if(p.getProduct().compareToIgnoreCase(pname) == 0) {
                System.out.println("what do you want to edit :\n1.Specification\n2.Cost\n3.Product count");
                int ch = scr.nextInt();
                if(ch == 1) {
                    System.out.println("Enter product specification ");
                    scr.nextLine();
                    String st = scr.nextLine();
                    p.editOrUpdate(ch);
                }else if(ch == 2) {
                    System.out.println("Enter product cost ");
                    double cost = scr.nextDouble();
                    p.editOrUpdate(cost);
                }else {
                    System.out.println("\nEnter product count ");
                    int count = scr.nextInt();
                    p.editOrUpdate(count);
                }
                return;
            }System.out.println();
        }
        System.out.println("\nProduct not found");
    }
    public static void productdetails(List<product> list) {
        System.out.println("\nEnter product name : ");
        scr.nextLine();
        String pname = scr.nextLine();
        for(product p: list) {
            if(p.getProduct().compareToIgnoreCase(pname) == 0) {
                p.ProductDetails();
                return;
            }
        }
        System.out.println("\nProduct not found");System.out.println();
    }
    public static void productcount(List<product> list) {
        System.out.print("\nEnter product name : ");
        scr.nextLine();
        String pname = scr.nextLine();
        boolean f = false;
        for(product p: list) {
            if((p.getProduct()).compareToIgnoreCase(pname) == 0) {
                System.out.println("count of "+p.getProduct() + " is "+p.ProductCount());
                f = true;
                break;
            }
        }
        if(!f)
            System.out.println("Product not found");
    }
    public static void productList(List<product> list) {
        if(list.size() == 0) {
            System.out.println("Empty ... ");
            return;
        }
        int i = 1 ;
        for(product p:list)
            System.out.println((i++) + " " +p.getProduct());
        System.out.println();
    }
    public static void updateInventory(List<product> list) {
        System.out.println("--------------");
        System.out.println("   1. add poduct");
        System.out.println("   2. delete product");
        System.out.println("enter  your choice");System.out.println();
        scr.nextLine();
        int n = scr.nextInt();
        if(n == 1) {
            System.out.println("enter productName,Specification,cost,count : ");
            scr.nextLine();
            String t = scr.nextLine();
            String []arr = t.split(" ");
            String name = arr[0];
            String spec = arr[1];
            double cost = Double.parseDouble(arr[2]);
            int count = Integer.parseInt(arr[3]);
            product p1 = new product(name,spec,cost,count);
            list.add(p1);
        }else {
            System.out.println("Enter name to delete product : ");
            scr.nextLine();
            String pname = scr.nextLine();
            int i = 0;
            for(product p: list) {
                if((p.getProduct()).compareToIgnoreCase(pname) == 0) {
                    break;
                }
                i++;
            }
            if(i == list.size())
                System.out.println("product not found");
            else {
                list.remove(i);
                System.out.println("Product removed successfully");
            }
        }
    }
}