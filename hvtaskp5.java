import java.io.FileReader;
import java.io.BufferedReader;
public class hvtaskp5 {
    public static void main(String[] args) {
        try{
            String line="";
            int noOfTranscitions=0;
            double minCost=50000000.00;
           double maxCost=0.00;
           double totalCost=0;
           BufferedReader br = new BufferedReader(new FileReader("demoDataBase.csv"));
           while((line =br.readLine())!=null){
                String[] Transaction=line.split(",");
                double Cost=Double.parseDouble(Transaction[3]);
                totalCost+=Cost;
                if(Cost>maxCost){
                    maxCost=Cost;
                }
                if(Cost<minCost){
                    minCost=Cost;
                }
                noOfTranscitions+=1;
           }
           System.out.println("total no of bills:"+noOfTranscitions);
           System.out.println("total bill amount:"+totalCost);
           System.out.println("max bill amount"+maxCost);
           System.out.println("min bill amount"+minCost);

        }
        catch(Exception e){
            System.out.println("Try block is not excuted");
        }
    }
}
