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
 *
 * Вывести сведения о товарах, срок годности которых
 * истекает через двое суток.
 */
class Item{
    private String name;
    public void setName(String name)
    {
        name = name.trim()
        char sim = name.charAt(0);
        int simCode = (int) sim;
        if ((simCode >= 65 && simCode <= 90) || (simCode >= 97 && simCode <= 122) )
        {
            this.name = name;
        }
        else
        {
            this.name = " ";
        }
    }
    public String getName()
    {
        if ((int) name.charAt(0) != 32)
        {
            return name;
        }
        else
        {
            System.out.println("Товар указан неверно. Введите коректное название с буквой в первом символе!");
            System.exit(0);
            return "";
        }
    }

    private double price;
    void setPrice(double price)
    {
        if (price > 0)
        {
            this.price = price;
        }
        else
        {
            this.price = 0;
        }
    }
    public double getPrice()
    {
        return price;
    }
    private LocalDate dataProduction = LocalDate.of(1,1,1);
    public void setDataProduction(int years, int month, int day)
    {
        if ((years > 1999 && years < 2023) && (month > 0 && month < 13) && (day > 0 && day < 32))
        {
            if (month == 2 && day > 28)
            {
               day = 20;
            }
            this.dataProduction = LocalDate.of(years, month, day);
        }
        else
        {
            this.dataProduction = LocalDate.of(1,1,1);
        }
    }
    public LocalDate getDataProduction()
    {
        if (dataProduction.getYear() > 1)
        {
            return dataProduction;
        }
        else
        {
            System.out.println("Вы ввели некоректную дату.");
            System.exit(0);
            return LocalDate.of(0,0,0);
        }
    }

    private LocalDate dataLife;
    public void setDataLife()
    {
        this.dataLife = dataProduction.plusDays((int) (Math.random() * 4 + 1));
    }
    public LocalDate getDataLife()
    {
        return dataLife;
    }

    private int amount;
    public void setAmount(int amount)
    {
        if (amount > 0)
        {
            this.amount = amount;
        }
        else
        {
            this.amount = 1;
        }
    }
    public int getAmount() {
        return amount;
    }

    private String creator;
    public void setCreator(String creator)
    {
        this.creator = creator.trim();
    }
    public String getCreator()
    {
        return creator;
    }
    public void getInfo()
    {
        System.out.print("Name: " + this.getName() + ", ");
        System.out.print("Price: " + this.getPrice() + ", ");
        System.out.print("Data Production: " + this.getDataProduction() + ", ");
        System.out.print("Data life: " + this.getDataLife() + ", ");
        System.out.print("Amount: " + this.getAmount() + ", ");
        System.out.println("Creation: " + this.getCreator() + ".");
    }
}

/**
 *BASIC
 * Производитель
 * Модель
 * Процессор
 * Объем оперативной памяти
 * Объём жёсткого диска
 * Цена
 *
 * Вычислить среднюю цену среди всех компьютеров и
 * напечатать сведения о всех компьютерах с ценой,
 * выше средней.
 */
class Computer
{
    private String brand;
    public void setBrand(String brand)
    {
        brand = brand.trim();
        char sim = brand.charAt(0);
        int simCode = (int) sim;
        if ((simCode >= 65 && simCode <= 90))
        {
            this.brand = brand;
        }
        else
        {
            this.brand = " ";
        }
    }
    public String getBrand()
    {
        if ((int) brand.charAt(0) != 32)
        {
            return brand;
        }
        else
        {
            System.out.println("В бренде должна быть заглавная буква!");
            System.exit(0);
            return "";
        }
    }

    public String model;
    public void setModel(String model)
    {
        this.model = model.trim();
    }
    public String getModel()
    {
        return model;
    }

    private String cpu;
    public void setCpu(String cpu)
    {
        cpu = cpu.trim();
        char sim = cpu.charAt(0);
        int simCode = (int) sim;
        if ((simCode >= 65 && simCode <= 90))
        {
            this.cpu = cpu;
        }
        else
        {
            this.cpu = " ";
        }
    }
    public String getCpu()
    {
        if ((int) cpu.charAt(0) != 32)
        {
            return cpu;
        }
        else
        {
            System.out.println("В CPU должна быть заглавная буква!");
            System.exit(0);
            return "";
        }
    }

    private int ozy;
    public void setOzy(int ozy)
    {
        if (ozy > 1)
        {
            this.ozy = ozy;
        }
        else
        {
            this.ozy = -1;
        }
    }
    public int getOzy()
    {
        if (ozy != -1)
        {
            return ozy;
        }
        else
        {
            System.out.println("Введите коректное значение ОЗУ в Гб!");
            System.exit(0);
            return 0;
        }
    }
    private int storage;
    public void setStorage(int storage)
    {
        if (storage > 1)
        {
            this.storage = storage;
        }
        else
        {
            this.storage = -1;
        }
    }
    public int getStorage()
    {
        if (storage != -1)
        {
            return storage;
        }
        else
        {
            System.out.println("Введите коректное значение ЖД в Гб!");
            System.exit(0);
            return 0;
        }
    }

    private int price;
    public void setPrice(int price)
    {
        if (price > 1)
        {
            this.price = price;
        }
        else
        {
            this.price = 1;
        }
    }
    public int getPrice()
    {
        return price;
    }
    public void getInfo()
    {
        System.out.print("Brand: " + getBrand() + ", ");
        System.out.print("Model: " + getModel() + ", ");
        System.out.print("CPU: " + getCpu() + ", ");
        System.out.print("OZY: " + getOzy() + ", ");
        System.out.print("Storage: " + getOzy() + ", ");
        System.out.println("Price: " + getPrice() + ", ");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        advanced();
        basic();
    }

    /**
     * Смотреть класс Item
     */
    private static void advanced()
    {
        Item[] items = new Item[50];
        for (int i = 0; i < items.length; i++)
        {
            try
            {

                items[i] = new Item();
                items[i].setName("Item " + (i + 1));
                items[i].setPrice((int) (Math.random() * 99 + 1));
                items[i].setDataProduction((int) (Math.random() * 23  + 2000) ,(int) (Math.random() * 12 + 1),(int) (Math.random() * 29 + 1));
                items[i].setDataLife();
                items[i].setAmount((int) (Math.random() * 10  + 1));
                items[i].setCreator("Digalv");
                if ((items[i].getDataLife().getDayOfMonth() - items[i].getDataProduction().getDayOfMonth()) == 2)
                {
                    items[i].getInfo();
                }
            }
            catch (Exception e)
            {
                System.out.println("Вы ввели некоректные значения, попробуйте еще раз!");
                break;
            }

        }
    }

    /**
     * Смотреть класс Computer
     */
    private static void basic()
    {
        String[] brand = new String[3];
        brand[0] = "Asus"; brand[1] = "HP"; brand[2] = "Lenovo";
        String[] model = new String[3];
        model[0] = "Acsac"; model[1] = "FMD32"; model[2] = "Gf4-b3";
        String[] cpu = new String[2];
        cpu[0] = "Intel"; cpu[1] = "AMD";
        int[] ozy = new int[3];
        ozy[0] = 4; ozy[1] = 8; ozy[2] = 16;
        int[] storage = new int[2];
        storage[0] = 256; storage[1] = 512;

        Computer[] comp = new Computer[50];
        int sum_price = 0;
        for (int i = 0; i < comp.length; i++)
        {
            comp[i] = new Computer();
            try
            {
                comp[i].setBrand(brand[(int) (Math.random() * 3)]);
                comp[i].setModel(model[(int) (Math.random() * 3)]);
                comp[i].setCpu(cpu[(int) (Math.random() * 2)]);
                comp[i].setOzy(ozy[(int) (Math.random() * 3)]);
                comp[i].setStorage(storage[(int) (Math.random() * 2)]);
                comp[i].setPrice((int) (Math.random() * 501 + 1000));
                sum_price += comp[i].getPrice();
            }
            catch (Exception e)
            {
                System.out.println("Произошла ошибка, проверьте данные: ");
            }
        }

        System.out.println("Avg= " + sum_price / comp.length);

        for (int i = 0; i < comp.length; i++)
        {
            if (comp[i].getPrice() > sum_price / comp.length)
            {
                comp[i].getInfo();
            }
        }
    }
}