package LAB24;

public interface ChairAbstractFactory{
    VictorianChair createVictorianChair(int n);
    MagicChair createMagicanChair();
    FunctionalChair createFunctionalChair();
}
