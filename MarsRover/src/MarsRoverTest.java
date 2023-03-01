import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    private MarsRover _rover;
    @BeforeEach
    void setup(){
        //arrange
        _rover = new MarsRover(3);
    }
    @Test
    void when_I_pass_M_I_receive_0_1_N() {

        //act
        var expected ="0:1:N";
        var actual= _rover.execute("M");
        //assert
        assertEquals(expected,actual);
    }
    @Test
    void when_I_pass_in_MM_I_receive_0_2_N(){
        //act
        var expected ="0:2:N";
        var actual= _rover.execute("MM");
        //assert
        assertEquals(expected,actual);
    }

    @Test
    void when_I_pass_in_MMM_I_receive_0_0_N(){
        //act
        var expected ="0:0:N";
        var actual= _rover.execute("MMM");
        //assert
        assertEquals(expected,actual);
    }
}