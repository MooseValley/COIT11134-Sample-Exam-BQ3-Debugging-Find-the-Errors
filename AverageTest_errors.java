public class AverageTest_errors
{
   public static double findAverage( LinkedList<> sales)
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
      int  sales = {65,67,50,75,70,55};
      LinkedList<> salesList = new LinkedList<Integer>();
      for( int i=0;i< sales.length; i++)
         salesList.add(sales[i]);

      //calculate the average sales
      int averageSales = findAverage(salesList);
      System.out.println("average sales : $%.2f",averageSales);
   } // main end

} // class end
