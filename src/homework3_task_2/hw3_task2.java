package homework3_task_2;

import java.io.*;

public class hw3_task2 {
    public static void main(String[] args) throws IOException {

        String path = hw3_task2.class.getClassLoader().getResource("").getPath();
        String result = "";
        FileReader file = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(file);
        StringBuilder rez = new StringBuilder();

        while (bufferedReader.ready()) {
                String readline = bufferedReader.readLine();
                rez.append(readline+" ");
        }

        System.out.println(rez);
        file.close();

    }
}




