package luyenthi.worker;

public class WS implements IWS{
    IWR repository = new WR();

    @Override
    public void display() {
        repository.display();
    }

    @Override
    public void add(Worker worker) {
        repository.add(worker);
    }

    @Override
    public Worker find(String name) {
        return repository.find(name);
    }
}
