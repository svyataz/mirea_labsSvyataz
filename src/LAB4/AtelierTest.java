package LAB4;

public class AtelierTest {
    public static void  main(String[] args) {
        Clothes[] Clothes_list = new Clothes[]{new TShirt(sizes.M, 3200, "white"),
                new Pants(sizes.L, 10000, "beige"),
                new Tie(3200, "white"),
                new Skirt(sizes.XS, 5000, "white")};

        Atelier atelier = new Atelier(Clothes_list);
        atelier.DressMan();
        atelier.DressWomen();
    }
}
