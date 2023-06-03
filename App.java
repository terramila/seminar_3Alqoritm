package seminar_3;

public class App {
    public static void main(String[] args) {
        OneWayList list = new OneWayList();
        list.addFirst(new OneWayNode(1));
        list.addFirst(new OneWayNode(2));
        list.addFirst(new OneWayNode(3));
        list.addFirst(new OneWayNode(4));
        list.addFirst(new OneWayNode(5));
        print(list);
        Reverse.oneWayListReverse(list);
        print(list);
    }
}