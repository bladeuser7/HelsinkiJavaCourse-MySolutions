
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.day++;
        if (this.day == 31) {
            this.month++;
            this.day = 1;
            if (this.month == 13) {
                this.month = 1;
                this.year++;
            }
        }
    }

    public void advance(int howManyDays) {
        int step = 0;
        while (step < howManyDays) {
            advance();
            step++;
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate added = new SimpleDate(this.day, this.month, this.year);
       added.advance(days);

        return added;

    }
}
