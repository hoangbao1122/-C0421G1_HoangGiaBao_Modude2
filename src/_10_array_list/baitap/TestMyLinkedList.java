package _10_array_list.baitap;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst("BẢO");
        myLinkedList.addLast("hoàng");
        myLinkedList.add(1, "Gia");

        myLinkedList.list();
//        myLinkedList.clear();
//        System.out.println(myLinkedList.get(2));
//        myLinkedList.removeFirst();
//        myLinkedList.removeLast();
//        myLinkedList.remove(1);
//        System.out.println(myLinkedList.indexOf("hoàng"));
        System.out.println("");
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());


//        myLinkedList.printList();
    }
}
