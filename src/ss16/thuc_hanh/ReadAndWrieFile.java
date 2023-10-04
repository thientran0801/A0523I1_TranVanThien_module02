package ss16.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrieFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        }catch (Exception e) {
            System.out.println("Error!");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max, boolean append) {
        try {
            File file = new File(filePath);
            FileWriter fileWriter = new FileWriter(filePath, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("giá trị lớn nhất là: "+max);
            bufferedWriter.close();
        }catch (Exception e) {

        }
    }

    public int findMax(List<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWrieFile readAndWrieFile = new ReadAndWrieFile();
        List<Integer> list = readAndWrieFile.readFile("D:\\codegym\\module02\\src\\ss16\\thuc_hanh\\listnumbers.txt");
        int maxOfList = readAndWrieFile.findMax(list);
        readAndWrieFile.writeFile("D:\\codegym\\module02\\src\\ss16\\thuc_hanh\\max.txt", maxOfList, false);
    }
}
