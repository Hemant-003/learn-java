import java.util.*;

class Person {
    String name;
    Expense advance;
    ArrayList<Expense> spend = new ArrayList();

    public Person(String name, int advance){
        this.name = name;
        this.advance = new Expense(advance);
    }

    public void spent(Expense spent){

    }

    @Override
    public String toString(){
        return name + "\t" + advance;
    }
}
