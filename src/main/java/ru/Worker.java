package ru;

public class Worker {
    private String name;
    private Integer tabelNumber;
    private String phone;
    private int experience;

    public Worker(String name, Integer tabelNumber, String phone, int experience) {
        this.name = name;
        this.tabelNumber = tabelNumber;
        this.phone = phone;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public Integer getTabelNumber() {
        return tabelNumber;
    }

    public String getPhone() {
        return phone;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "\n" + "Worker{" +
                "name='" + name + '\'' +
                ", tabelNumber=" + tabelNumber +
                ", phone='" + phone + '\'' +
                ", experience=" + experience +
                '}' + "\n" ;
    }
}
