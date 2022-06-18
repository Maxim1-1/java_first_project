package homework2_advanced;

public class task1_advanced {
    public static void main(String[] args) {

        double increment = 0.01123;

        double result = 0;

        int i = 0;


        while (result < 1000000) {
            if (result < 0) {
                break;
            }
            else {
                i = i + 1;
                result =result+ increment;

            }

        }
        System.out.println(i);
    }
}
