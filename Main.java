package Java_3;

public class Main {

    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        iob.swap(2,4);
        iob.transform();
        iob.print();
    }


}
