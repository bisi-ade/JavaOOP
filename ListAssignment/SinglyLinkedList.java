public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // Methods
    private boolean isEmpty() {
        return this.head == null;
    }

    public void addFront(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addBack(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            return;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public Double removeBack() {
        Node runner = head;
        double returnedValue;
        // 0 nodes - return null
        if (isEmpty()) {
            System.out.println("The list is Empty");
            return null;
        }
        // 1 node - remove & return head
        if (head.next == null) {
            returnedValue = head.value;
            head = null;
            return returnedValue;
        }
        // more than 1 node - loop to end, remove and return last node
        while (runner.next.next != null) {
            runner = runner.next;
        }
        returnedValue = runner.next.value;
        runner.next = null;
        return returnedValue;
    }

    public void printValues() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node runner = this.head;
        while (runner.next != null) {
            System.out.println("$$$$$$$$$$$$$$$");
            String s = String.format("Node value: %s :: Nexint Value: %s", runner.value, runner.next.value);
            System.out.println(s);
            runner = runner.next;
        }
        System.out.println("$$$$$$$$$$$$$$$");
        String s = String.format("Node value: %s :: Nexint Value: null", runner.value);
        System.out.println(s);
    }

    public Node find(int value) {
        System.out.println("Finding value " + value);
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        Node runner = this.head;
        if (runner.value == value) {
            String s = String.format("Node found: " + runner + " :: Value: " + value);
            System.out.println(s);
            return runner;
        } else {
            while (runner.next != null) {
                runner = runner.next;
                if (runner.value == value) {
                    String s = String.format("Node found: " + runner + " :: Value: " + value);
                    System.out.println(s);
                    return runner;
                }
            }
            System.out.println("Value not in list");
            return null;
        }
    }
}
