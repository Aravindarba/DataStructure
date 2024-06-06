package org.example;

public class Switch17 {

 public static  void main(String args[]) {
     String day = "Wednesday";
     switch (day) {
         case "Monday", "Wednesday" -> System.out.println("Weekday");
         case "Sunday", "Saturday" -> System.out.println("Weekend");
         case "Tuesday" -> System.out.println("Weekday");
        case "Thursday" -> System.out.println("Weekday");

         default -> System.out.println("master Day");
     }
 }

}
