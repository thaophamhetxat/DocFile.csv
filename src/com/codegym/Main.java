package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<QuocGia> list = new ArrayList<>();
    static File quocGia = new File("quocGia.csv");



    public static void main(String[] args) throws IOException {

        quocGia.createNewFile();
        docFile();
        for (QuocGia qg : list) {
            System.out.println(qg);
        }
        list.add(new QuocGia("VN", "18", "nam"));
        ghiFile();
    }

    public static void docFile() throws IOException {
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(quocGia);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(", ");
                if (str.length >= 3) {
                    list.add(new QuocGia(str[0], str[1], str[2]));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }

    }

    public static void ghiFile() throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(quocGia);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (QuocGia qg : list) {
                bufferedWriter.write(qg.ghi());
                bufferedWriter.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
        }

    }

}
