import java.util.*;

public class HW_Java_03 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            arrayList.add(random.nextInt(1, 100));
        }

        System.out.println("Begin array: ");
        System.out.println(arrayList + "\n");

        for (Iterator<Integer> i = arrayList.iterator();
             i.hasNext();) {
            if (i.next() % 2 == 0)
                i.remove();
        }
        System.out.println("Array without even numbers: ");
        System.out.println(arrayList + "\n");

        Collections.sort(arrayList);
        System.out.println("Sorted array: ");
        System.out.println(arrayList + "\n");

        System.out.println("Min number: " + arrayList.get(0));
        System.out.println("Max number: " + arrayList.get(arrayList.size() - 1));
        System.out.println("Medium number: " + arrayList.get(arrayList.size() - 1) / 2);
    }
}
