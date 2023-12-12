package LAB24;

public class MagicChair implements Chair {
    public void doMagic(){
        System.out.println("MAGIC");
    }

    @Override
    public String toString() {
        return "MagicChair";
    }
}
