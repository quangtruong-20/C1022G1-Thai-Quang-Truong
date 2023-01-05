package luyenthi.worker;

import java.util.ArrayList;
import java.util.List;

public class WR implements IWR {
    List<Worker> workers = new ArrayList<>();

    @Override
    public void display() {
        workers = Csv.read();
        for (Worker c: workers
             ) {
            System.out.println(c);
        }
    }

    @Override
    public void add(Worker worker) {
        workers = Csv.read();
        workers.clear();
        workers.add(worker);
       Csv.write(workers);

    }

    @Override
    public Worker find(String name) {
        workers = Csv.read();
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).getName().contains(name)){
                System.out.println(workers.get(i));
                Csv.write(workers);
            }
        }
        return null;
    }
}
