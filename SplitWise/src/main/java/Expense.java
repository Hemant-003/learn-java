import java.util.Date;

class Expense {
    int amount;
    Date date = new Date();

    Expense(int amount, Date date){
        this.amount = amount;
        this.date = date;
    }

    Expense() {

    }

    @Override
    public String toString() {
        return "" + amount;
    }

    void reduce(Expense e) {
        amount = amount - e.amount;
    }

    Expense add(Expense x) {
        this.amount = x.amount + this.amount;
        return this;
    }
}