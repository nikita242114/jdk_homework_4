package ru;

public class Main {
    public static void main(String[] args) {
        Directory directoryWorker = new Directory();

        Worker worker1 = new Worker("Anna",1234,"88888888",5);
        Worker worker2 = new Worker("Vika",1234,"55555555",10);
        Worker worker3 = new Worker("Artem",3333,"99999999",5);
        Worker worker4 = new Worker("Anna",1284,"77777777",3);

        directoryWorker.add(worker1);
        directoryWorker.add(worker2);
        directoryWorker.add(worker3);
        directoryWorker.add(worker4);
        System.out.println(directoryWorker.getWorkers());

        System.out.println(directoryWorker.searchByExperience(5));

        directoryWorker.phoneWorker("Anna");

        directoryWorker.searchTabelNumber(1234);

    }
}