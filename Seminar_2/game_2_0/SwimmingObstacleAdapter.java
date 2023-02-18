


public class SwimmingObstacleAdapter implements Obstacle {
    private final SwimmingPoll SwimmingPoll;

    public SwimmingObstacleAdapter(SwimmingPoll SwimmingPoll) {
        this.SwimmingPoll = SwimmingPoll;
    }

    @Override
    public boolean pass(Participant participant) {
        return SwimmingPoll.pass(participant);
    }
}
