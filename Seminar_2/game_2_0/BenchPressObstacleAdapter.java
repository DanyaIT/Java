public class BenchPressObstacleAdapter implements Obstacle {
    private final BenchPress benchPress;

    public BenchPressObstacleAdapter(BenchPress benchPress){
        this.benchPress = benchPress;
    }

    @Override
    public boolean pass(Participant participant){
        return benchPress.pass(participant);
    }

}
