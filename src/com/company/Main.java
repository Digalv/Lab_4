package com.company;




public class Main {
    public static void main(String[] args) {
        advanced();
        basic();
    }

    /**
     * Смотреть класс Item
     */
    private static void advanced() {
        Item[] items = new Item[50];
        for (int i = 0; i < items.length; i++) {
            try {
                items[i] = new Item("Item " + (i + 1), (float) (Math.random() * 99 + 1), (int) (Math.random() * 10 + 1), "Digalv");
            } catch (Exception e) {
                System.out.println("Вы ввели некоректные значения, попробуйте еще раз!");
                break;
            }
            if ((items[i].getDataLife().getDayOfMonth() - items[i].getDataProduction().getDayOfMonth()) == 2) {
                System.out.println(items[i].toString());
            }
        }
    }

    /**
     * Смотреть класс Computer
     */
    private static void basic() {
        Computer[] comp = new Computer[50];
        int sum_price = 0;
        for (int i = 0; i < comp.length; i++) {
            try {
                comp[i] = new Computer(DataBaseComputerParts.getRandomBrandName(), DataBaseComputerParts.getRandomModelName(), DataBaseComputerParts.getRandomCpuName(), (int) (Math.random() * 11 + 2), DataBaseComputerParts.getRandomStorage(), (int) (Math.random() * 501 + 1000));
            } catch (Exception e) {
                System.out.println("Произошла ошибка, проверьте данные: ");
                System.exit(0);
            }
            sum_price += comp[i].getPrice();
        }

        System.out.println("Avg= " + sum_price / comp.length);

        for (Computer computer : comp) {
            if (computer.getPrice() > sum_price / comp.length) {
                computer.getInfo();
            }
        }
    }
}
