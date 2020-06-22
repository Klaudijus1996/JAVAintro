package mokyniuPazangumas;

public class blogiausiasMokinys {

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
    //
//    @Override
//    public String toString() {
//        return "Oh thee,  " + name + "  be first of thy name, for whom thy be given evaluation of:  " + score +
//                ",  shall be then punished or rewarded by thee 'Round':  " + roundedScore;
//    }
    @Override
    public String toString() {
        return   "Surasti ir atspausdinti mokini su maziausiu vidurkiu: " +
                name + ", " + score + ", (" + roundedScore +")";
    }
}
