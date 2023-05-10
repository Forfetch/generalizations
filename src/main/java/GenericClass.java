import java.util.Arrays;

public class GenericClass <T extends Number>{
    private T[] array;

    public GenericClass(T[] array) {
        this.array = array;
    }
    public void printSum() {
        double sum = Arrays.stream(array)
                .mapToDouble(Number::doubleValue)
                .sum();
        System.out.println("Sum of array elements: " + sum);
    }
}
