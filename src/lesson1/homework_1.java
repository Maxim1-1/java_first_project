package lesson1;

import java.util.Arrays;
import java.util.Locale;

/////////////////task_1////////////////////////

//public class homework_1 {
//     public static void main(String[] args) {
//        String hi = "                Hello ";
//        String world = " WoRld!";
//        char newLine = '\n';
//         String new_str = (hi.trim())+(world.toLowerCase(Locale.ROOT))+(newLine);
//         System.out.print(new_str.repeat(3));
//    }
//}

/////////////////task_2////////////////////////

//public class homework_1 {
//    public static void main(String[] args) {
//     float weight = (float) 75.6;
//     float height = (float) 1.75;
//
//     float mass_body = (weight/height*height);
//     System.out.print(mass_body);
//    }
//}

/////////////////task_3////////////////////////

public class homework_1 {
    public static void main(String[] args) {

          String [] array = {"a","b","c","d","e"};

          System.out.println(String.join("",array));
          String rep = String.join("",array).replace("d","h");
          System.out.print(rep);


    }
}