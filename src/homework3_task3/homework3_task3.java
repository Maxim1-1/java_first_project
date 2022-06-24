package homework3_task3;

import java.io.FileWriter;
import java.io.IOException;

public class homework3_task3 {
    public static void main(String[] args) throws IOException {
        FinancialRecord new_object = new FinancialRecord(500,300);
      String path = "D:\\java_folder\\first_project\\src\\homework3_task3\\report.txt";
//        String report = "\\report.txt";
//        String path = hw3_task2.class.getClassLoader().getResource("").getPath()+report;

//        String path = "/homework3_task3/report.txt";


        FileWriter file = new FileWriter(path);
        file.write("доходы = "+ new_object.getIncomes()+" расходы = "+new_object.getOutcomes());
        file.close();







    }

}





