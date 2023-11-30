package warcraft_v_2;

public class Application {
    public void start(){
        User user = new User();
        System.out.println("Game start");
        Warcraft warcraft = new Warcraft(user);
        while(warcraft.generalMainActive()){
            user = warcraft.user;
        }
        System.out.println("Game end");
    }
}
