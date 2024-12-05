package Lab8;

public class Lab8_1 {

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    int size = 0;

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        size++;
    }

    public void printList() {
        if (head == null) {
            System.out.print("List is empty.");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "--->");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public void deleteFirst() {
        if (head == null) {
            head = null;
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
        size--;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public int getSize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private Node reverseRecursive(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node newHead = reverseRecursive(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        Lab8_1 list = new Lab8_1();
        list.addFirst("D");
        list.addFirst("C");
        list.addFirst("B");
        list.addFirst("A");
        list.printList();
        list.addLast("E");
        list.addLast("F");
        list.addLast("G");
        list.addLast("H");
        list.printList();
        list.deleteFirst();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.deleteLast();
        list.printList();
        list.reverse();
        list.printList();
        list.addFirst("G");
        list.head = list.reverseRecursive(list.head);
        list.printList();
        System.out.println("The size of the list is " + list.getSize());
    }
}
