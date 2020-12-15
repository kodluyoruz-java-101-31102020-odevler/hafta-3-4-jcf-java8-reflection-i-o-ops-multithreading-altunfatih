package question01;

public class NodeSample<E> {
    E element;
    NodeSample<?> next;
    NodeSample<?> prev;
    int index;

    public NodeSample(E element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }

    public NodeSample(int index, E element) {
        this.element = element;
        this.next = null;
        this.prev = null;
        this.index = index;
    }

    public NodeSample() {
        this.element = null;
        this.next = null;
        this.prev = null;
        this.index = 0;
    }
}