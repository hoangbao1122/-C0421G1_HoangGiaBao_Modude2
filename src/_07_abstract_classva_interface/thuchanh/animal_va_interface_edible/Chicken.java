package _07_abstract_classva_interface.thuchanh.animal_va_interface_edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return  "gà gáy  ò ó o o";
    }

    @Override
    public String howtoEat() {
        return "gà ăn thóc";
    }
}
