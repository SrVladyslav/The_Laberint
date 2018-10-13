package me.vladyslav.thelaberint.utils;

import java.io.*;

public class SaveManager {

    private static final String SAVE_PATH = "resources/save/save.txt";

    private SaveManager() {
    }

    public static boolean checkSave() {

        File file = new File(SAVE_PATH);
        return file.exists();

    }

    public static void save(String coords) {

        BufferedWriter writer;

        try {

            writer = new BufferedWriter(new FileWriter(SAVE_PATH));
            writer.write(coords);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String load() {

        String coords = "";
        BufferedReader reader = null;

        try {

            reader = new BufferedReader(new FileReader(SAVE_PATH));
            coords = reader.readLine();
            reader.close();

        } catch (IOException e){
            e.printStackTrace();
        }

        return coords;
    }
}
