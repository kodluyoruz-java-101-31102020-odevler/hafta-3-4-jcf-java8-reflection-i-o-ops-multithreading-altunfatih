package question01;

public class LinkedListSample<E> {
    private NodeSample<E> head;
    private NodeSample<E> tail;
    private int size;

    public LinkedListSample() {
        this.size = 0;
    }

    public int size() {
        int listSize = 0;
        NodeSample tempNode = head;
        while (tempNode != null) {
            listSize++;
            tempNode = tempNode.next;
        }
        return listSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E element) {
        if (head == null)
            head = tail = new NodeSample<>(element);
        else if (head.element == element) {
            NodeSample tempNode = new NodeSample(element);
            tempNode.next = head;
            head.prev = tempNode;
            head = tempNode;
        } else if (tail.element == element) {
            NodeSample newNode = new NodeSample(element);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            NodeSample<?> newNode = new NodeSample(element);
            NodeSample<?> temp = head;
            while (temp.next != null && temp.element != element) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;
        }
    }

    public void write() {
        NodeSample temp = head;
        StringBuilder builder = new StringBuilder();
        while (temp != null) {
            builder.append("Element -> ");
            builder.append(temp.element);
            builder.append(" | ");
            System.out.print(builder.toString());
            temp = temp.next;
        }
        System.out.println();
    }

    public void remove(E element) {
        if (head == null)
            head = tail = new NodeSample<>(element);
        if (head.element == element) {
            head = (NodeSample<E>) head.next;
            if (head != null)
                head.prev = null;
        }
        else if (tail.element == element) {
            tail = (NodeSample<E>) tail.prev;
            if (tail != null)
                tail.next = null;
        } else {
            NodeSample tempNode = head;
            while (tempNode.next != null && tempNode.next.element != element) {
                tempNode = tempNode.next;
            }
            if (tempNode != null) {
                tempNode.next = tempNode.next.next;
                tempNode.prev = tempNode;
            }
        }
    }

    public boolean search(E element) {
        NodeSample tempNode = head;
        while (tempNode != null) {
            if (tempNode.element == element) {
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }
}