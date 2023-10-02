package LAB4;

public class Atelier implements MenClothing, WomenClothing{
    Clothes[] clothes_list;

    public Atelier(Clothes[] clothes_list) {
        this.clothes_list = clothes_list;
    }

    @Override
    public void DressMan() {
        for(Clothes c : clothes_list){
            System.out.println();
            if (c instanceof MenClothing) {
                if(c instanceof TShirt){System.out.println("футболка");
                    System.out.println("размер: " + c.size);
                    System.out.println(c.size.getDescription());}
                else if(c instanceof Pants){System.out.println("штаны");
                    System.out.println("размер: " + c.size);
                    System.out.println(c.size.getDescription());}
                else {System.out.println("галстук");}
                System.out.println("цена: " + c.cost);
                System.out.println("цвет: " + c.color);
            }
        }
    }
    @Override
    public void DressWomen() {
        for(Clothes c : clothes_list){
            if (c instanceof WomenClothing) {
                if(c instanceof TShirt){System.out.println("футболка");}
                else if(c instanceof Pants){System.out.println("штаны");}
                else {System.out.println("юбка");}
                System.out.println("размер: " + c.size);
                System.out.println(c.size.getDescription());
                System.out.println("цена: " + c.cost);
                System.out.println("цвет: " + c.color);
            }
        }
    }
}
