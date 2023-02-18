

public class SwimmingPoll{

    private final int distance;

    public SwimmingPoll(int distance) {
        this.distance = distance;
    }

    
    public boolean pass(CanSwim canSwim) {
        return canSwim.getSwim() >= distance;
    }
}
