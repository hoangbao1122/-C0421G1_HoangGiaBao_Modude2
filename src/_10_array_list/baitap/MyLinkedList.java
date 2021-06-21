package  _10_array_list.baitap;

import _11_Stack_Queue.thuchanh.Queue.Note;

public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int numNodes = 0;
    private class Node {
        private Node next;
        private Object data;
        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return data;
        }
    }
    public MyLinkedList() {
    }
    public void addFirst(E data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
        if (tail == null) {
            tail = head;
        }
    }
    public void addLast(E data){
        if (tail == null) {
              tail = new Node(data);
        } else {
            tail.next = new Node(data);
            tail = tail.next;
        }
    }
    public void add(int index, E data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }
    public int size(){
        return numNodes;
    }
    public E removeFirst(){
        if (numNodes == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        numNodes--;
        if (numNodes == 1) {
            head = tail = null;
        }
        return (E) temp;
    }
    public E removeLast() {
        if (numNodes == 0) return null;
        else if (numNodes == 1) {
            Node temp = head;
            head = tail = null;
            numNodes = 0;
            return (E) temp.data;
        } else {
            Node current = head;
            for (int i = 0; i < numNodes - 2; i++)
                current = current.next;
            Node temp = tail;
            tail = current;
            tail.next = null;
            numNodes--;
            return (E) temp.data;
        }
    }
    public E remove(int index) {
        if (index < 0 || index >= numNodes){
            return null;
        }
        else if (index == 0) {
            return removeFirst();
        }
        else if (index == numNodes - 1) {
            return removeLast();
        }
        else {
            Node previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            Node current = previous.next;
            previous.next = current.next;
            numNodes--;
            return (E) current.data;
        }
    }
    public void list() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public int indexOf(E data) {
        Node temp = head;
        if (temp.getData().equals(data)){
            return 0;
        }
        for (int i = 1; temp.next != null; i++) {
            temp = temp.next;
            if (temp.getData().equals(data)){
                return i;
            }
        }
        return -1;
    }
    public void  clear(){
        Node temp = head;
        head = null;
        for (int i = 0; i < numNodes; i++) {
            temp.next = head;
        }
        numNodes = 0;
    }
    public E getLast(){
        Node temp = head;
        for (int i = 0;i<numNodes;i++){
            temp = temp.next;
        }
        return (E)temp.data;
    }
    public E getFirst(){
       return (E) head.data;
    }

}