import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void add() {
        //arrange
        Main main = new Main();
        //act
        var expected =5;
        var actual=main.add(2,2);

        //assert
        assertEquals(expected,actual);
    }
}