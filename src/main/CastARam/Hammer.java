package main.CastARam;

public abstract class Hammer {

    int ID;
    String brand;
    String name;
    int hardness;
    int wage;
    int price;
    String material;


    public Hammer(int ID, String brand, String name, int hardness, int wage, int cena, String material) {
        this.ID = ID;
        this.brand = brand;
        this.name = name;
        this.hardness = hardness;
        this.wage = wage;
        this.price = cena;
        this.material = material;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHardness() {
        return hardness;
    }

    public void setHardness(int hardness) {
        this.hardness = hardness;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}