import implementations.ReversedList;

public class Main {
    public static void main(String[] args) {
        ReversedList<Integer>list = new ReversedList<>();
        list.add(13);
        list.add(15);
        list.add(17);
        System.out.println(list.iterator().next().intValue());
        System.out.println(list.iterator().next().intValue());
        System.out.println(list.iterator().next().intValue());
        System.out.println(list.iterator().next().intValue());
    }
}
