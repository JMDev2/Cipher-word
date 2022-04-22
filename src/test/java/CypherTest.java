import org.junit.Test;


import static junit.framework.TestCase.assertEquals;

public class CypherTest {
//    @Test
//    public void cipherCharacter_returnsCharPlusTwoPosition_C(){
//        Cypher cypher = new Cypher();
//        Character expected = 'C';
//        assertEquals(expected, cypher.cipherCharacter('A'));
//
//    }
    @Test
    public void cipherCharacter_returnsCharPlusTwoPosition_B(){
        Cypher cypher = new Cypher();
        Character expected = 'C';
        assertEquals(expected, cypher.cipherCharacter('Z'));

    }



}

