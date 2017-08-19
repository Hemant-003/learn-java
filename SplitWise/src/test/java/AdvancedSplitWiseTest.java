import org.junit.Before;
import org.junit.Test;
import util.Util;

import java.text.ParseException;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class AdvancedSplitWiseTest {
    private AdvancedSplitWise splitWise;
    private Person raj = new Person("Raj");

    @Before
    public void setUp(){
         splitWise = new AdvancedSplitWise();

    }

    @Test
    public void testAddExpense() throws ParseException {
        Transaction e = new Transaction(200, Util.getDate("21/07/2014"));
        splitWise.addPerson(raj);

        splitWise.addExpense(raj, e);
        splitWise.addExpense(raj, e);

//        assertEquals(splitWise.expenseFor(Calendar.JULY).amount, 400);
    }

    @Test
    public void testGetBalance(){

    }


    @Test
    public void testAddAdvance() throws ParseException {
//        raj.addAdvance(new Transaction(1000, Util.getDate("03/08/2010")));
//        splitWise.takeAdvance(raj);
    }

    @Test
    public void testAddPerson() {
        splitWise.addPerson(raj);

        assertEquals(1, splitWise.people.size());
    }

}