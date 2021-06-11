package _07_abstract_classva_interface.thuchanh.animal_va_interface_edible;

public class Tiger extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "Tiger gầm roa!";
    }

    @Override
    public String howtoEat() {
        return "tiger ăn thịt";
    }
}
