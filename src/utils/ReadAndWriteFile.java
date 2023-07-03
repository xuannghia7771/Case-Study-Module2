package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeFile(String pathFile, String text, boolean append){
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void updateFile(String pathFile, List<String> list) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String line : list) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<String> readFile(String pathFile){
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("FILE NOT FOUND!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
}
