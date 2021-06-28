package _16_IO.baitap.coppyFile;

import java.io.*;

public class CoppyFile {

    public static void main(String[] args) {
        writeFile("testgoc.txt");
        readAndCopFile("testgoc.txt","coppy.txt");
    }
    public static void writeFile(String pathFile){
        try {
            FileWriter fileWriter = new FileWriter(pathFile,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("bảo siêu cấp vip pro");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readAndCopFile(String pathFile,String pathFileNew){
        try {
            File file = new File(pathFile); // doc file
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String oChua = "";
            while ((line = bufferedReader.readLine())!= null){
                System.out.print(line);
                oChua = oChua + line;
            }
            bufferedReader.close();


            File fileNew = new File(pathFileNew);
            if (!fileNew.exists()){
                file.createNewFile();
            }
            System.out.println(fileNew.getAbsolutePath());
            FileWriter fileWriter = new FileWriter(pathFileNew,false); // cop sang file moi
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(oChua);
            fileNew.getAbsolutePath();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
