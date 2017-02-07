package week2.homework;

public class Node {
    private Node next;
    private Node first;
    private int element;

    private void add(int... data) {
        Node prev = null;
        for (int value : data) {
            Node node = new Node();
            node.element = value;
            if (prev != null) {
                prev.next = node;
            } else {
                first = node;
            }
            prev = node;
        }
    }

    private Node reverse(Node node){
        Node prev = null;
        Node current = first;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = prev;
        return node;
    }

    private void print() {
        Node node = first;
        while (node != null) {
            System.out.printf("%d ", node.element);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.add(1,2,3,4,5,6,7,8,9,10);
        node.print();
        System.out.println();
        node.reverse(node);
        node.print();
    }
}
