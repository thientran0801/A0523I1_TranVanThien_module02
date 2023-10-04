package ss16.bai_tap;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        final String PATH_FILE = "D:\\codegym\\module02\\src\\ss16\\bai_tap\\country.csv";
        List<Country> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(PATH_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] array = line.split(",");
                Country country= new Country(Integer.parseInt(array[0]), array[1], array[2]);
                list.add(country);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Country country :list) {
            System.out.println(country);
        }
    }
}
class Country {
    private int id;
    private String code;
    private String name;

    public Country() {
    }

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + this.id +", CODE: " + this.code + ", NAME: " + this.name;
    }
}
