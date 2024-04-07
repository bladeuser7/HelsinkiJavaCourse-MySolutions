
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ace
 */
public class Grades {

    private ArrayList<Integer> grade;

    public Grades() {
        this.grade = new ArrayList<>();
    }

    public void add(int points) {
        this.grade.add(points);
    }

    public ArrayList<Integer> getGrade() {
        return grade;
    }

    public int getSize() {
        return this.grade.size();
    }

    public int getTotal() {
        int total = 0;
        for (int grades : grade) {
            total += grades;
        }
        return total;
    }

    public double getAverage() {
        double average = 1.0 * (this.getTotal() / grade.size());
        return average;
    }

    public String stars(int gradeCounter) {
        int stars = 0;
        String starsString = "";
        while (stars < gradeCounter) {
            starsString += "*";
            stars++;
        }
        return starsString;
    }

    public String gradeDistribution(Grades grade) {
        int stars50 = 0;
        int stars60 = 0;
        int stars70 = 0;
        int stars80 = 0;
        int stars90 = 0;
        int stars90a = 0;
        for (int grades : grade.getGrade()) {
            if (grades < 50) {
                stars50++;
            } else if (grades < 60) {
                stars60++;
            } else if (grades < 70) {
                stars70++;
            } else if (grades < 80) {
                stars80++;
            } else if (grades < 90) {
                stars90++;
            } else if (grades >= 90) {
                stars90a++;
            }
        }
        return "\n" + "5:" + stars(stars90a)
                + "\n" + "4:" + stars(stars90)
                + "\n" + "3:" + stars(stars80)
                + "\n" + "2:" + stars(stars70)
                + "\n" + "1:" + stars(stars60)
                + "\n" + "0:" + stars(stars50);
    }
}
