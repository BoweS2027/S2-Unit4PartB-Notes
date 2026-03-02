import java.util.ArrayList;
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
      //4.8 array list
      //array list is a resizable colloection you can add or remove items from listst! array list is mutatable
      ArrayList<String> toDo = new ArrayList<String>();
      // For numbers must use Wrapper classes
      ArrayList<Integer> intList = new ArrayList<Integer>();
      ArrayList<Double> doubList = new ArrayList<Double>();
      //arraylist methods (assume "list" is an ArrayList)
      int numTasks = toDo.size();
      System.out.println("Number of items on To Do list: " + numTasks);
      //list.add(obj) appends the obj to end of list
      // returns a boolean, but that's not important
      toDo.add("eat food");
      toDo.add("shower");
      toDo.add("nap");
      System.out.println(toDo.size());
      System.out.println(toDo); 
      toDo.add(1, "drink water");
      System.out.println(toDo); 
      //remember thatindexes start at 0
      //list.get(index) returns the item
      String firstItem=toDo.get(0);
      System.out.println("do this first: " + firstItem);
      //list.set(index,object) replaces
      String replacedItem = toDo.set(0,"die");
      System.out.println(toDo);
      System.out.println("we replaced: " + replacedItem);
      //list.remove(index) removes the item
      String removedItem = toDo.remove(2);
      System.out.println("toDo");
      System.out.println("We removed the item: " + removedItem);
      ArrayList<Integer> scores = new ArrayList<Integer>();
      scores.add(22);
      scores.add(22);
      scores.add(22);
      System.out.println(scores);
      for(Integer currentScore : scores){
         System.out.println("Test Score: " + currentScore);
      }
      double sum = 0;
      for(Integer score : scores){
         sum += score;
      }
      double avg = sum/scores.size();
      System.out.println(avg);
   }
}
