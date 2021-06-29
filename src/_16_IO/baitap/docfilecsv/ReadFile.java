package _16_IO.baitap.docfilecsv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public List<String> readFile(String filePath) {
        List<String> list = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                list.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
