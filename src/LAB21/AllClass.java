package LAB21;

import java.util.Arrays;

public class AllClass<E> {
    private E[] ALL;

    public AllClass(E[] ALL) {
        this.ALL = ALL;
    }

    public E[] getALL() {
        return ALL;
    }

    public void setALL(E[] ALL) {
        this.ALL = ALL;
    }

    @Override
    public String toString() {
        return "AllClass{" +
                "ALL=" + Arrays.toString(ALL) +
                '}';
    }
}
