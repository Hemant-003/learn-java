import org.junit.Test;
import util.Util;

import java.awt.*;
import java.util.*;

import static org.junit.Assert.*;

public class TransactionTest {
    @Test
    public void testCompareTo() throws Exception {
        Transaction transaction1 = new Transaction(1, Util.getDate("12/07/2012"));
        Transaction transaction2 = new Transaction(1, Util.getDate("12/08/2012"));
        Transaction transaction3 = new Transaction(1, Util.getDate("11/06/2012"));

        java.util.List<Transaction> transactions = Arrays.asList(transaction1, transaction2, transaction3);

        transactions.stream().sorted().forEach(System.out::println);
        assertEquals(-1, transaction1.compareTo(transaction2));
    }

}