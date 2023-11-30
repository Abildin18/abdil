package warcraft_v_2;

import java.util.Scanner;

public class SingleClass {
    public void nation(){
        System.out.println("1)Lyudi");
        System.out.println("2)Orki");
        System.out.println("3)Elfy");
        System.out.println("4)Nezhit");
    }
    public String getNation(){
        nation();
        Scanner sc = new Scanner(System.in);
        while(true) {

            System.out.println("Choose");
            String chose = sc.nextLine();
            if (chose.equals("1") || chose.equals("Lyudi")) {
                return "Lyudi";
            }
            if (chose.equals("2") || chose.equals("Orki")) {
                return "Orki";
            }
            if (chose.equals("3") || chose.equals("Elfy")) {
                return "Elfy";
            }
            if (chose.equals("4") || chose.equals("Nezhyt")) {
                return "Nezhyt";
            }
            System.out.println("ERROR");
        }




    }
}
