import java.lang.reflect.Array;
import java.util.Arrays;

public class CreateArrays {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        String strings[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven"};
        char characters[] = {'a', 'b', 'c', 'd', 'e'};
        boolean bools[] = {true, false, true, true};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(characters));
        System.out.println(Arrays.toString(bools));
    }
}
