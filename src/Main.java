import model.Summoner;
import model.SummonerManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean quit = false;
        String name;
        Scanner input = new Scanner(System.in);
        SummonerManager summonerManager = SummonerManager.getInstance();
        Summoner summoner;
        while(!quit){
            System.out.println("Please enter summoner name");
            name = input.nextLine();
            if(name.equals("quit")) {
                quit = true;
            }else {
                summoner = summonerManager.getSummoner(name);
                System.out.println(summoner.toString());
            }

        }
    }
}
