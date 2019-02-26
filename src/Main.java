import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean quit = false;
        String name;
        Scanner input = new Scanner(System.in);
        SummonerManager summonerManager = SummonerManager.getInstance();
        MatchManager matchManager = MatchManager.getInstance();
        Summoner summoner;
        while(!quit){
            System.out.println("Please enter summoner name");
            name = input.nextLine();
            if(name.equals("quit")) {
                quit = true;
            }else {
                summoner = summonerManager.getSummoner(name);
                MatchInfo[] matchInfos = matchManager.getMatches(summoner.getSummonerName(),summoner.getMatchesList());
                System.out.println(summoner.toString());
                for(int i = 0 ; i < matchInfos.length; i++)
                    System.out.println((i+1) + ". " + matchInfos[i].toString());
                int number;
                boolean q = false;
                while(!q) {
                    System.out.println("select a number to view full info");
                    number = input.nextInt();
                    input.nextLine();
                    if(number == 0)
                        q = true;
                    else
                        System.out.println(matchManager.getMatch(matchInfos[number-1].getGameId()).toString());
                }
            }

        }
    }
}
