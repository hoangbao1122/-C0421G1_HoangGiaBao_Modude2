package case_study.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFile<T>{
    public  void Write(String pathFile, List<T> list) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
             fileOutputStream = new FileOutputStream(pathFile);
             objectOutputStream = new ObjectOutputStream(fileOutputStream);
             objectOutputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<T> Read(String pathfile) {
        List<T> list = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(pathfile);
            objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<T>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
