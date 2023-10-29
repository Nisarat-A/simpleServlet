package sit.int202.simple.simpleservlet;

public class calGrade {
    private int score;

    public calGrade(int score) {
        this.score = score;
    }

    //รับอย่างเดียวห้ามไปset
    public int getScore() {
        return score;
    }

    public String getGrade() {
        if (score >= 80) {
            return "A" ;
        } else if (score>=70) {
            return "B";
        } else if (score>=60) {
            return "C";
        }else return "F" ;
    }
}
