public class BenchPress {
    private final int weight;

    public BenchPress(int weight){
        this.weight = weight;
    }

    public boolean pass(CanPress canPress){
        return canPress.getPress() >= weight;
    }
}
