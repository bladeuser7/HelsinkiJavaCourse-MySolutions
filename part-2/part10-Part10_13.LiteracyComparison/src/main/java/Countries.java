
public class Countries {

    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double literature;

    public Countries(String theme, String ageGroup, String gender, String country, int year, double literature) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literature = literature;

    }

    public String getTheme() {
        return this.theme;
    }

    public String getAgeGroup() {
        return this.ageGroup;
    }

    public String getGender() {
        String[] gender = this.gender.split(" ");
        return gender[0];
    }

    public String getCountry() {
        return this.country;
    }

    public int getYear() {
        return this.year;
    }

    public double getLiterature() {
        return this.literature;
    }

    public String toString() {
        return this.country + " (" + this.year + "), " + this.getGender() + ", " + this.literature;
    }

}
