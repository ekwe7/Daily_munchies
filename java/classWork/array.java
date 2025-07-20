import java.sql.SQLOutput;


public class array {
    public static void main(String[] args){
        final int ARRAY_SIZE = 10;
        int[] number = new int[ARRAY_SIZE];
        int total = 0;

        for (int count = 0; count < number.length; count++) {
            number[count] = 2 + 2 * count;

        }
        System.out.printf("%1s%8s%n", "number", "values");

        for (int index = 0; index < number.length; index++) {
            System.out.printf("%1d%8%n", index, number[index]);
        }





