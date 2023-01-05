package luyenthi.worker;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Csv {
    public static final String CSV = "D:\\codegym\\module2\\src\\luyenthi\\worker\\worker.csv";

    public static List<Worker> read() {
        List<Worker> workerList = new ArrayList<>();
        BufferedReader buff = null;

        try {
            FileReader reader = new FileReader(CSV);
            buff = new BufferedReader(reader);

            String line;
            String[] temp;
            Worker worker;


            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                worker = new Worker((temp[0]), temp[1], temp[2]);
                workerList.add(worker);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                buff.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return workerList;
    }

    public static void write(List<Worker> workers) {
        BufferedWriter buff = null;
        try {
            FileWriter fileWriter = new FileWriter(CSV, true);
            buff = new BufferedWriter(fileWriter);

            for (Worker c : workers
            ) {

                buff.write(c.getId() + "," + c.getName() + "," + c.getAddress());
                buff.newLine();
                buff.flush();
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                buff.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
