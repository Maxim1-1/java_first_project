package homework2;

public class homework2_task2 {
    public static void main(String[] args) {

        int ageChildren = 17;

        if ((ageChildren < 6) & (ageChildren>0)) {
            System.out.print("пошел в сад");
        }
        else if ((ageChildren < 11) & (ageChildren>=6)) {
            System.out.print("пошел в младшую школу");
        }
        else if ((ageChildren < 17) & (ageChildren>=11)) {
            System.out.print("пошел в среднюю школу");
        } else if ((ageChildren >= 17) & (ageChildren>=0)){
            System.out.print("пошел в университет");
        }

    }
}