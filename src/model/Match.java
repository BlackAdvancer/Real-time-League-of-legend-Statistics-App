package model;

import java.util.ArrayList;
import java.util.List;

public class Match {
    String platformId;
    String gameMode;
    String gameType;
    int mapId;
    long gameDuration;
    long gameCreation;
    Team blurTeam;
    Team redTeam;
    List<Participant> participants;

    public Match(String platformId, String gameMode, String gameType, int mapId, long gameDuration, long gameCreation, Team blurTeam, Team redTeam) {
        this.platformId = platformId;
        this.gameMode = gameMode;
        this.gameType = gameType;
        this.mapId = mapId;
        this.gameDuration = gameDuration;
        this.gameCreation = gameCreation;
        this.blurTeam = blurTeam;
        this.redTeam = redTeam;
        participants = new ArrayList<>();
    }

    public void addParticipants(Participant participant){
        participants.add(participant);
    }
}
