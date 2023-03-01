import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void when_I_pass_M_I_receive_0_1_N_() {
        //arrange
        MarsRover rover = new MarsRover();
        //act
        var expected ="0:1:N";
        var actual=rover.execute("M");

        //assert
        assertEquals(expected,actual);
    }
}