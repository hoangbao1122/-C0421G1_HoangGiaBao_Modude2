package _16_IO.baitap.docfilecsv;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ReadFile().readFile("country.txt");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            String[] split = list.get(i).split(",");
            Country country = new Country(Integer.parseInt(split[0]), split[1], split[2]);
            System.out.println(country);
        }
    }
}
