// Practice Exam question solution by Mike OMalley.
import java.util.LinkedList;

public class AverageTest_fixed
{
   public static double findAverage( LinkedList<Integer> sales)
   {
      double total = 0.0;

      //calculating the total and average
      for (int i = 0; i < sales.size(); i++)
         total = sales.get(i);

      return total/sales.size();
   } // method end

   public static void main(String[] args)
   {
      //sales array has been initialized here
      int[]  sales = {65,67,50,75,70,55};
      LinkedList<Integer> salesList = new LinkedList<Integer>();

      for( int i=0;i< sales.length; i++)
         salesList.add(sales[i]);

      //calculate the average sales
      double averageSales = findAverage(salesList);
      System.out.printf("average sales : $%.2f",averageSales);
   } // main end

} // class end
