import java.util.Scanner;
public class Dialog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello?What's your mood?");
        String x = sc.nextLine();
        if(x.equals("good")||x.equals("normal")){
            System.out.println("That's good if your mood is good or normal");
        }
        if(x.equals("bad")){
            System.out.println("Don't be sad. After a time it will be all good");
        }


    }
}
