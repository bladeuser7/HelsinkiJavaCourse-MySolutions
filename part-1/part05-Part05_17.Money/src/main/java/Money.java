
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
//        if (this == compared) {
//            return false;
//        }
//        if (!(compared instanceof Money)) {
//            return false;
//        }
        Money comparedMoney = (Money) compared;
        if (this.euros < comparedMoney.euros) {
            return true;
        }
        if (this.euros == comparedMoney.euros && this.cents < comparedMoney.cents) {
            return true;
        } else {
            return false;
        }
    }
//    public Money reset(euro, cents){
//        return 
//    }
    
    public Money minus(Money decreaser) {
        int newEuros = this.euros - decreaser.euros;
    int newCents = this.cents - decreaser.cents;
      if (newEuros < 0){
          newEuros = 0;
          newCents = 0;
      }

    if (newCents < 0) {
        newCents += 100;
        newEuros--;
    }

    Money newMoney = new Money(newEuros, newCents);
   
    return newMoney;
    }
}
