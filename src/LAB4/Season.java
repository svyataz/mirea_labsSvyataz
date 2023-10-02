package LAB4;

public enum Season {
    WINTER("Зима", -10),
    SPRING("Весна", 10),
    SUMMER("Лето", 25),
    AUTUMN("Осень", 10);

    private final String name;
    private final int term;

    Season(String name, int avgTemperature) {
        this.name = name;
        this.term = avgTemperature;
    }

    public String getName() {
        return name;
    }

    public int getTerm() {
        return term;
    }

    public String getDescription() {
        if (this == SUMMER) {
            return "Теплое время года";
        } else {
            return "Холодное время года";
        }
    }
    public static void favorite_season(Season season) {
        switch (season) {
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
        }
    }
}
