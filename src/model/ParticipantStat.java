package model;



public class ParticipantStat {
    int kills;
    int deaths;
    int assists;
    int goldEarned;
    int totalMinionsKilled;
    int champLevel;
    int[] items;

    public ParticipantStat(int kills, int deaths, int assists, int goldEarned, int totalMinionsKilled, int champLevel, int[] items) {
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.goldEarned = goldEarned;
        this.totalMinionsKilled = totalMinionsKilled;
        this.champLevel = champLevel;
        this.items = items;
    }

    @Override
    public String toString(){
        String temp;
        temp =  "\nKills: " + kills +
                "\nDeaths: " + deaths +
                "\nAssists: " + assists +
                "\nGold Earned: " + goldEarned +
                "\nCS: " + totalMinionsKilled +
                "\nChampion Level: " + champLevel;
        StringBuilder sb = new StringBuilder(temp);
        for (int i = 0; i < 7; i++) {
            temp = "\nitem" + i + ": " + items[i];
            sb.append(temp);
        }
        sb.append("\n");
        return sb.toString();
    }
}
