/*I worked on the homework assignment alone, using only course materials.*/
public class Musician {

    private String name;
    private String instrument;
    private int yearsPlaying;
    private double skillLevel;

    public String getName() {
        return name;
    }

    public String getInstrument() {
        return instrument;
    }

    public int getYearsPlaying() {
        return yearsPlaying;
    }

    public double getSkillLevel() {
        return skillLevel;
    }

    /*The skillLevel instance variable is determined inside the constructors by the value for yearsPlaying.
At 0 years played, skillLevel is 1.0. Add 0.5 to skillLevel for every additional year played.*/

    public Musician(String name, String instrument, int yearsPlaying) {
        this.name = name;
        this.instrument = instrument;
        this.yearsPlaying = yearsPlaying;
        skillLevel = 1 + (0.5 * yearsPlaying);
    }

    public Musician(String name, String instrument) {
        this(name, instrument, 0);
        skillLevel = 1 + (0.5 * yearsPlaying);
    }


    public void rehearse() {
        skillLevel += 0.5;
        yearsPlaying++;
    }

    public void perform() {
        skillLevel++;
    }

    public String toString() {
        String performanceHistory =
            "My name is " + name + ". I have been playing " + instrument + " for " + yearsPlaying + " years.";
        return performanceHistory;
    }

}
