package question01;

public class Main {
    public static void main(String[] args) {

        LinkedListSample<String> linkedListTest = new LinkedListSample<>();
        linkedListTest.add("Fatih");
        linkedListTest.add("Ömer");
        linkedListTest.write();
        System.out.println(linkedListTest.size());
        linkedListTest.remove("Ömer");
        linkedListTest.write();
        System.out.println(linkedListTest.size());
        linkedListTest.add("Cumali");
        linkedListTest.add("Ayşe");
        linkedListTest.add("Büşra");
        linkedListTest.write();
        System.out.println(linkedListTest.size());
        linkedListTest.remove("Ayşe");
        linkedListTest.write();
        System.out.println(linkedListTest.size());
    }
}