package model;


import parsers.MatchParsers;
import providers.MatchProvider;

import java.util.List;

public class Summoner extends Player {
    long[] matchesList;
    int summonerLevel;

    public Summoner(String summonerName, String summonerId, String accountId, int profileIronId,int summonerLevel){
        super(summonerName,summonerId,accountId,profileIronId);
        this.summonerLevel = summonerLevel;
    }

    public void setMatchesList(long[] matchesList) {
        this.matchesList = matchesList;
    }

    public Match[] getMatches(){
        Match[] matches = new Match[5];
        MatchParsers matchParsers = new MatchParsers();
        for(int i = 0; i < 5; i++){
            matches[i] = matchParsers.ParseMatch(Long.toString(matchesList[i]));
        }
        return  matches;
    }

    @Override
    public String toString() {
        StringBuilder reString = new StringBuilder( super.toString() + "SummonerLevel: " + summonerLevel);
        for(long i : matchesList) {
            reString.append("\nMatchId: ");
            reString.append(i);
        }
        reString.append("\n");
        return reString.toString();
    }
}
