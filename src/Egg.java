public class Egg {
    private final String name;
    private int progress = 0;
    private boolean increasing = true;
    private int heat = 30;
    private String mood = "calm";

    public Egg(String name) {
        this.name = name;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getProgress() {
        return progress;
    }
    public void setProgress(int progress) {
        this.progress = progress;
    }

    public boolean isIncreasing() {
        return increasing;
    }
    public void setIncreasing(boolean increasing) {
        this.increasing = increasing;
    }

    public int getHeat() {
        return heat;
    }
    public void setHeat(int heat) {
        this.heat = heat;
    }

    public String getMood() {
        return mood;
    }
    public void setMood(String mood) {
        this.mood = mood;
    }
}
