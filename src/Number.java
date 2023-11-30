import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] fruits = new String[4];
        fruits[0]="Mango";
        fruits[1]="Apple";
        fruits[2]="Strawberry";
        fruits[3]="Watermelon";
        System.out.println(fruits[1]);

        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Watermelon");
        fruitList.remove("Strawberry");

        System.out.println(fruitList.contains("Apple"));
        System.out.println(fruitList);



    }
}
