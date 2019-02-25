package model;



public class Match {
    String platformId;
    String gameMode;
    String gameType;
    int mapId;
    long gameDuration;
    long gameCreation;
    Team blurTeam;
    Team redTeam;
    Participant[] participants;

    public Match(String platformId, String gameMode, String gameType, int mapId, long gameDuration, long gameCreation, Team blurTeam, Team redTeam, Participant[] participants) {
        this.platformId = platformId;
        this.gameMode = gameMode;
        this.gameType = gameType;
        this.mapId = mapId;
        this.gameDuration = gameDuration;
        this.gameCreation = gameCreation;
        this.blurTeam = blurTeam;
        this.redTeam = redTeam;
        this.participants = participants;
    }

    @Override
    public String toString() {
        String temp;
        temp =  "Match{" +
                "platformId='" + platformId + '\'' +
                ", gameMode='" + gameMode + '\'' +
                ", gameType='" + gameType + '\'' +
                ", mapId=" + mapId +
                ", gameDuration=" + gameDuration +
                ", gameCreation=" + gameCreation +
                '}' + "\nBlue Team: " + blurTeam.toString() +
                "\nred Team: " + redTeam.toString();
        StringBuilder sb = new StringBuilder(temp);
        for (Participant p : participants)
            sb.append(p.toString());
        return  sb.toString();
    }
}
