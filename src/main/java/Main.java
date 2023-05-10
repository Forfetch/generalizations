public class Main {
    public static void main(String[] args) {
        Integer [] array1 = {1,2,3,4,5};
        GenericClass<Integer> intArray = new GenericClass<>(array1);
        intArray.printSum();

        Double [] array2 = {1.1,2.2,3.3,4.4,5.5};
        GenericClass<Double> doubleArray = new GenericClass<>(array2);
        doubleArray.printSum();
    }
}
