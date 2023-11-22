package LAB14;

import java.util.regex.*;

public class TASK4 {
    public static void main(String[] args) {
        String text = "Prices: 25.98 USD, 120 RUB, 10.5 EU, 44 ERR, 0.004 EU";

        // Extract prices in USD, RUB, and EU
        String usdPattern = "\\b(\\d+\\.\\d{1,2})\\s+USD\\b";
        String rubPattern = "\\b(\\d+)\\s+RUB\\b";
        String euPattern = "\\b(\\d+\\.\\d{1,2})\\s+EU\\b";

        Pattern patternUSD = Pattern.compile(usdPattern);
        Pattern patternRUB = Pattern.compile(rubPattern);
        Pattern patternEU = Pattern.compile(euPattern);

        Matcher matcherUSD = patternUSD.matcher(text);
        Matcher matcherRUB = patternRUB.matcher(text);
        Matcher matcherEU = patternEU.matcher(text);


        while (matcherUSD.find()) {
            System.out.println(matcherUSD.group());
        }

        while (matcherRUB.find()) {
            System.out.println(matcherRUB.group());
        }

        while (matcherEU.find()) {
            System.out.println(matcherEU.group());
        }
    }
}