
public class linkedlist {

    public static class Node {

        int value;
        Node next;

        Node(int val) {
            this.value = val;
            this.next = null;

        }

    }

    public static void print(Node head) {
        int count = 0;
        Node curr = head;
        while (curr.next != null) {
            System.out.print(curr.value);
            curr = curr.next;
            count++;

        }
    }

    public static int length(Node head) {
        Node curr = head;
        int count = 1;
        while (curr.next != null) {
            curr = curr.next;
            count++;
        }
        return count;

    }

    public static void remove(int position, int value, Node head) {
        if (position == 1) {
            head = head.next;
        } else {
            Node curr = head;
            int count = 0;
            while (count < position - 1) {
                curr = curr.next;
                count++;
            }
            Node escape = curr.next.next;
            curr.next = escape;

        }
    }

    public static void insert(int position, int value, Node head) {
        Node newNode = new Node(value);
        if (position == 0 || head == null) {
            head = newNode;
        } else {
            Node curr = head;
            int count = 0;
            while (count < position - 1) {
                curr = head.next;
                count++;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }

    }

    public static void main(String[] args) {
        Node newNode = new Node(10);//new node== head in this ;
        newNode.next = new Node(20);
        newNode.next.next = new Node(30);
        newNode.next.next.next = new Node(30);
        // call
        //call
        // call
    }
}
