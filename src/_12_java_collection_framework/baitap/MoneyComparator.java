package _12_java_collection_framework.baitap;

import _07_abstract_classva_interface.baitap.Colorable.Colorable;

import java.util.Comparator;
import java.util.function.Function;

public class MoneyComparator implements Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {
        return (int)(o1.getMoney() - o2.getMoney());
    }

}
