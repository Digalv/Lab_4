package com.company;

public class DataBaseComputerParts {
    public static final String[] model = {"Acsac", "FMD32", "Gf4-b3"};
    public static final String[] cpu = {"Intel", "AMD"};
    public static final int[] storage = {256, 512, 1024, 2048};
    private static final String[] brand = {"Asus", "HP", "Lenovo"};

    public static String getRandomBrandName() {
        return brand[(int) (Math.random() * brand.length)];
    }

    public static String getRandomModelName() {
        return model[(int) (Math.random() * model.length)];
    }

    public static String getRandomCpuName() {
        return cpu[(int) (Math.random() * cpu.length)];
    }

    public static int getRandomStorage() {
        return storage[(int) (Math.random() * storage.length)];
    }
}
