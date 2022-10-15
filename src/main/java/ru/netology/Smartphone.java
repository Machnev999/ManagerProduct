package ru.netology;

public class Smartphone extends Product {
    // private String name;
    private String fabric;

    public Smartphone(int id, String name, int price, String fabric) {
        super(id, name, price);
        this.fabric= fabric;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }


}
