package bowling.domain.frame;

import bowling.domain.state.LastInProgress;
import bowling.domain.state.State;

public class LastFrame extends Frame {

    protected LastFrame(State state) {
        super(state);
    }

    public static Frame init() {
        return new LastFrame(LastInProgress.init());
    }
}
