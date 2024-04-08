package ru;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Directory {
    private ArrayList<Worker> workers ;

    public Directory() {
        this.workers = new ArrayList<>();
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public void add(Worker worker){
        boolean flag = false;
        for (Worker employ:workers) {
            if(Objects.equals(employ.getTabelNumber(), worker.getTabelNumber())){
                flag = true;
                break;
            }
        }
        if(!flag){
            workers.add(worker);
        }
    }

    public ArrayList<Worker> searchByExperience(int experience) {
        ArrayList<Worker> workerArrayList = new ArrayList<>();
        for (Worker employ : workers) {
            if (employ.getExperience() == experience) {
                workerArrayList.add(employ);
            }
        }
        return workerArrayList;
    }

    public void phoneWorker(String name) {
        List<Worker> workerArrayList = workers.stream().filter(e ->e.getName().equals(name)).toList();
        workerArrayList.forEach(e-> System.out.println(e.getPhone() + "->" + e.getName()));
    }

    public void searchTabelNumber(Integer tabelNumber){
        workers.stream().filter(e->e.getTabelNumber().equals(tabelNumber)).findFirst().ifPresent(System.out::println);
    }

}
