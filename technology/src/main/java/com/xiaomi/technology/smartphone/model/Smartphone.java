package com.xiaomi.technology.smartphone.model;

import jakarta.persistence.*;

@Entity
public class Smartphone {
    @Id
    @SequenceGenerator(
            name = "smartphone_sequence",
            sequenceName = "smartphone_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "smartphone_sequence"
    )
    private Integer id;
    private String name;
    private Integer storage;
    private Integer ram;
    private Integer battery;

    public Smartphone(String name, Integer storage, Integer ram, Integer battery) {
        setName(name);
        setStorage(storage);
        setRam(ram);
        setBattery(battery);
    }

    public Smartphone(){}

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "smartphone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", storage=" + storage +
                ", ram=" + ram +
                ", battery=" + battery +
                '}';
    }
}
