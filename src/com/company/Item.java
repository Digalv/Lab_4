package com.company;

import java.time.LocalDate;

/**
 * ADVANCED
 * Наименование
 * Цена
 * Дата производства
 * Срок годности
 * Количество
 * Производитель
 * <p>
 * Вывести сведения о товарах, срок годности которых
 * истекает через двое суток.
 */
class Item {
    public static final int MIN_PRODUCION_YEAR = 1999;
    private String name;
    private float price;
    private LocalDate dataProduction;
    private LocalDate dataLife;
    private int amount;
    private String creator;

    public Item(String name, float price, int amount, String creator) {
        this.setName(name);
        this.setPrice(price);
        this.setDataProduction((int) (Math.random() * 23 + 2000), (int) (Math.random() * 12 + 1), (int) (Math.random() * 29 + 1));
        this.setDataLife();
        this.setAmount(amount);
        this.setCreator(creator);
    }

    public String getName() {
        if ((int) name.charAt(0) != 32) {
            return name;
        } else {
            System.out.println("Товар указан неверно. Введите коректное название с буквой в первом символе!");
            System.exit(0);
            return "";
        }
    }

    public void setName(String name) {
        name = name.strip();
        this.name = (Character.isAlphabetic(name.charAt(0))) ? name : " ";
    }

    public float getPrice() {
        return price;
    }

    void setPrice(float price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    public void setDataProduction(int years, int month, int day) {
        if ((years > MIN_PRODUCION_YEAR && years < LocalDate.now().getYear() + 1) && (month > 0 && month < 13) && (day > 0 && day < 32)) {
            if (month == 2 && day > 28) {
                day = 20;
            }
            this.dataProduction = LocalDate.of(years, month, day);
        } else {
            this.dataProduction = LocalDate.of(1, 1, 1);
        }
    }

    public LocalDate getDataProduction() {
        if (dataProduction.getYear() > 1) {
            return dataProduction;
        } else {
            System.out.println("Вы ввели некоректную дату.");
            System.exit(0);
            return LocalDate.of(0, 0, 0);
        }
    }

    public void setDataLife() {
        try {
            this.dataLife = dataProduction.plusDays((int) (Math.random() * 4 + 1));
        } catch (Exception e) {
            System.out.println("Невозможно указать срок годности без даты изготовления!");
            System.exit(0);
        }
    }

    public LocalDate getDataLife() {
        return dataLife;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount >= 0) {
            this.amount = amount;
        } else {
            this.amount = 1;
        }
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator.strip();
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", " +
                "Price: " + this.getPrice() + ", " +
                "Data Production: " + this.getDataProduction() + ", " +
                "Data life: " + this.getDataLife() + ", " +
                "Amount: " + this.getAmount() + ", " +
                "Creation: " + this.getCreator() + ".";
    }
}
