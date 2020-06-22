package mokyniuPazangumas;

public class theBest {
    private String name;
    private double score;
    private int roundedScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }

    public int getRoundedScore() {
        return roundedScore;
    }
    public void setRoundedScore(int roundedScore) {
        this.roundedScore = roundedScore;
    }

    @Override
    public String toString() {
        return name + ", " + score + ", (" + roundedScore +")";
    }
}
