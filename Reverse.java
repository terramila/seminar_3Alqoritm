package gb.seminars.list_reverse.utils;

public class Reverse {
    public static void oneWayListReverse(OneWayList list) {
        OneWayNode node = list.getHead();
        OneWayNode next = node.getNext();
        OneWayNode previous = null;
        while (next != null) {
            if (previous == null) {
                node.setNext(null);
            } else {
                node.setNext(previous);
            }
            previous = node;
            node = next;
            next = next.getNext();
        }
        node.setNext(previous);
        list.setHead(node);
    }
}