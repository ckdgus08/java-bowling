package bowling.domain;

import bowling.domain.frame.Frames;

public class Game {

    private final String Player;
    private final Frames frames;

    public Game(String player, Frames frames) {
        Player = player;
        this.frames = frames;
    }
}
