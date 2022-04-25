package com.company;

/**
 * BASIC
 * Производитель
 * Модель
 * Процессор
 * Объем оперативной памяти
 * Объём жёсткого диска
 * Цена
 * <p>
 * Вычислить среднюю цену среди всех компьютеров и
 * напечатать сведения о всех компьютерах с ценой,
 * выше средней.
 */
class Computer {
    public static final int MIN_STORAGE_CAPACITY = 32;
    public String model;
    private String brand;
    private String cpu;
    private int ram;
    private int storage;
    private int price;


    public Computer(String model, String brand, String cpu, int ram, int storage, int price) {
        this.setModel(model);
        this.setBrand(brand);
        this.setCpu(cpu);
        this.setRam(ram);
        this.setStorage(storage);
        this.setPrice(price);
    }

    public String getBrand() {
        if ((int) brand.charAt(0) != 32) {
            return brand;
        } else {
            System.out.println("В бренде должна быть заглавная буква!");
            System.exit(0);
            return "";
        }
    }

    public void setBrand(String brand) {
        brand = brand.strip();
        char sim = brand.charAt(0);
        if (Character.isAlphabetic(sim) || Character.isDigit(sim)) {
            this.brand = brand;
        } else {
            this.brand = " ";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model.strip();
    }

    public String getCpu() {
        if ((int) cpu.charAt(0) != 32) {
            return cpu;
        } else {
            System.out.println("В CPU должна быть заглавная буква!");
            System.exit(0);
            return "";
        }
    }

    public void setCpu(String cpu) {
        cpu = cpu.trim();
        if (Character.isAlphabetic(cpu.charAt(0)) && Character.isUpperCase(cpu.charAt(0))) {
            this.cpu = cpu;
        } else {
            this.cpu = " ";
        }
    }

    public int getRam() {
        if (ram != -1) {
            return ram;
        } else {
            System.out.println("Введите коректное значение ОЗУ в Гб!");
            System.exit(0);
            return 0;
        }
    }

    public void setRam(int ram) {
        if (ram > 1) {
            this.ram = ram;
        } else {
            this.ram = -1;
        }
    }

    public int getStorage() {
        if (storage != -1) {
            return storage;
        } else {
            System.out.println("Введите коректное значение ЖД в Гб!");
            System.exit(0);
            return 0;
        }
    }

    public void setStorage(int storage) {
        if (storage > MIN_STORAGE_CAPACITY) {
            this.storage = storage;
        } else {
            this.storage = -1;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 1) {
            this.price = price;
        } else {
            this.price = 1;
        }
    }

    public void getInfo() {
        System.out.print("Brand: " + getBrand() + ", ");
        System.out.print("Model: " + getModel() + ", ");
        System.out.print("CPU: " + getCpu() + ", ");
        System.out.print("OZY: " + getRam() + ", ");
        System.out.print("Storage: " + getStorage() + ", ");
        System.out.println("Price: " + getPrice() + ", ");
    }
}
