package warcraft_v_2;

import java.util.Scanner;

public class Warcraft {
    User user;

    public Warcraft(User user) {
        this.user = user;
    }

    public void printGeneralMain(){
        System.out.println("                          1)  Single player");
        System.out.println("                          2)  Battlenet");
        System.out.println("                          3)  Local area network");
        System.out.println("                          4)  Options");
        System.out.println("                          5)  Credits");
        System.out.println("                          6)  Quit");
    }
    public boolean generalMainActive(){

        printGeneralMain();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Action");
        String active = sc.nextLine();
        if(active.equals("1") || active.equals("Single player")){
            System.out.println("You chose Single player");
            SingleClass single = new SingleClass();
            user.nation=single.getNation();
            user.heroes=getNameHeroes();
            return true;
        }
        if(active.equals("2") || active.equals("Battlenet")){
            System.out.println("You chose Battlenet");
            return true;
        }
        if(active.equals("3") || active.equals("Local area networkr")){
            System.out.println("You chose Local area network");
            return true;
        }
        if(active.equals("4") || active.equals("Options")){
            System.out.println("You chose Options");
            return true;
        }
        if(active.equals("5") || active.equals("Credits")){
            System.out.println("You chose Credits");
            return true;
        }if(active.equals("6") || active.equals("Quit")){
            System.out.println("You chose Quit");
            System.out.println("User Nations: "+user.nation);
            System.out.println("User Heroes: "+user.heroes);
            return false;
        }
        System.out.println("ERROR");
        return true;
    }
    public String[] generateHeroes(){
        String[] heroes= new String[10];
        heroes[0] = "Thrall ";
        heroes[1] = "Duratan ";
        heroes[2] = "Rex ";
        heroes[3] = "Gul' Dan";
        heroes[4] = "Garosh";
        heroes[5] = "Artas";
        heroes[6] = "Silvana";
        heroes[7] = "GulJin";
        heroes[8] = "Arhomond";
        heroes[9] = "Nerfurion";
        return heroes;
    }
    public String getNameHeroes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose hero");
        for(int i =0;i<generateHeroes().length;i++){
            System.out.println(i + ")" + generateHeroes()[i]);
        }
        return generateHeroes()[sc.nextInt()];
    }


}
