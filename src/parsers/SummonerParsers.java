package parsers;

import model.Summoner;
import org.json.JSONObject;
import providers.MatchListProvider;
import providers.SummonerProvider;

public class SummonerParsers {
    private SummonerProvider summonerProvider;
    private MatchListParsers matchListParsers;

    public SummonerParsers(){
        summonerProvider = new SummonerProvider();
        matchListParsers = new MatchListParsers() ;
    }

    public Summoner ParseSummoner(String name) {
        try {
            summonerProvider.setName(name);
            JSONObject jo = new JSONObject(summonerProvider.dataSourceToString());
            int profileIconId =jo.getInt("profileIconId");
            String summonerName = jo.getString("name");
            int summonerLevel = jo.getInt("summonerLevel");
            String accountId = jo.getString("accountId");
            String summonerId = jo.getString("id");
            Summoner summoner = new Summoner(summonerName,summonerId,accountId,profileIconId,summonerLevel);
            summoner.setMatchesList(matchListParsers.ParseMatchList(accountId));
            return summoner;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
