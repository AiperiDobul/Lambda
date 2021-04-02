package kg.megacom;

public class Clothes {
    private String name;
    private boolean inMyWardrobe;
    private Season season;
    private Color color;



    public Clothes(String name, boolean inMyWardrobe, Season season, Color color) {
        this.name = name;
        this.inMyWardrobe = inMyWardrobe;
        this.season = season;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInMyWardrobe() {
        return inMyWardrobe;
    }

    public void setInMyWardrobe(boolean inMyWardrobe) {
        this.inMyWardrobe = inMyWardrobe;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
