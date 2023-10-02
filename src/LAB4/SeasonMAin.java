package LAB4;
import java.util.Scanner;
public class SeasonMAin {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше любимое время года:");
        String temporary_season = in.nextLine();
        Season my_favorite_season = switch (temporary_season.toLowerCase()) {
            case "весна" -> Season.SPRING;
            case "лето" -> Season.SUMMER;
            case "осень" -> Season.AUTUMN;
            default -> Season.WINTER;
        };
        System.out.println("Мое любимое время года: " + my_favorite_season.getName());
        System.out.println("Средняя температура в это время года: " + my_favorite_season.getTerm());
        System.out.println("Описание этого времени года: " + my_favorite_season.getDescription());
        Season.favorite_season(my_favorite_season);
        for(Season season : Season.values()){
            System.out.println((season));
        }
    }
}
