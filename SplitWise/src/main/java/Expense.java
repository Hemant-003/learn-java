class Expense {
    int amount;
    String month;

    public Expense(int amount){
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "" + amount;
    }
}