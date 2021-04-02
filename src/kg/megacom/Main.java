package kg.megacom;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Clothes> thing = new ArrayList<>();
        thing.add(new Clothes("Shorts", true,Season.SUMMER, Color.BLUE));
        thing.add(new Clothes("Blouse", true,Season.SPRING, Color.WHITE));
        thing.add(new Clothes("Skirt", true,Season.SPRING, Color.RED));
        thing.add(new Clothes("Jacket", true,Season.WINTER, Color.BLACK));
        thing.add(new Clothes("Heels", true,Season.SPRING, Color.WHITE));
        thing.add(new Clothes("Bikini", false,Season.SUMMER, Color.PURPLE));
        thing.add(new Clothes("Suit", false,Season.AUTUMN, Color.BLACK));

        Searchable inMyWardrobe = clothes -> clothes.isInMyWardrobe() == true;
        Searchable season = clothes -> {
            switch (clothes.getSeason()){
                case SPRING:
                case SUMMER: return true;
                case AUTUMN:
                case WINTER: return false;
            }
            return false;
        };
        Searchable color = clothes -> {
            switch (clothes.getColor()){
                case WHITE:
                case RED: return true;
                case BLACK:
                case BLUE:
                case PURPLE: return false;
            }
            return false;
        };

        thing.forEach(Clothes -> System.out.println(inMyWardrobe.wear(Clothes) && season.wear(Clothes) && color.wear(Clothes)));


    }

}



@FunctionalInterface
interface Searchable{
    boolean wear(Clothes clothes);
}
