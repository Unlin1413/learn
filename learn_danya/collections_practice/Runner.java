package collections_practice;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        //todo: принято что слева всегда интерфейс (если он есть) а справа реализация
        List<Worker> workers = new ArrayList<>();
        workers.add(new Slesar());
        Worker tokar = new Tokar();
        workers.add(tokar);
        workers.add(new Kolyan());
        for (Worker worker : workers) {
            worker.work();
        }
    }
}
