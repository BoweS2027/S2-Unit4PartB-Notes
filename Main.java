public class Main {

   public static void main(String []args) {
      //4.7 wrapper classes
      Integer fancyInt = new Integer(1);
      Double fancyDoub = new Double(1.1);
      // calling the constructor is no longer necessary
      Integer fancierInt = 13;
      System.out.println(fancierInt);
      int regularInt = fancierInt;
      System.out.println(Integer.MIN_VALUE);
      System.out.println(Integer.MAX_VALUE);
      String stringyNums = "13.0";
      double parsedD = Double.parseDouble(stringyNums);
      System.out.println(parsedD);
      String stringyNums2 = "13";
      int parsedI = Integer.parseInt(stringyNums2);
      System.out.println(parsedI);
   }
}
