package LAB24;

public class ChairFactory implements ChairAbstractFactory{
    @Override
    public VictorianChair createVictorianChair(int n) {
        return new VictorianChair(n);
    }
    @Override
    public MagicChair createMagicanChair() {
        return new MagicChair();
    }
    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
