package arrays;

public class largest_number_without_sorting {
    public static void main(String[] args) {
        int[] a = { 7, 2, 11, 9, 0 };
        int max_val = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max_val) {
                max_val = a[i];
            }
        }
        System.out.println("Largest number is "+max_val);

    }

}
