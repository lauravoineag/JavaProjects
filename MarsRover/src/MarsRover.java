import java.text.MessageFormat;

public class MarsRover {
    private int _yPosition;
    private int _xPosition;
    private String _direction ="N";

    public String execute(String command) {
        if (command == "M")
        {
            _yPosition += 1;
        }
        else
        {
            _yPosition += 2;
        }

        return MessageFormat.format(
                "{0}:{1}:{2}", _xPosition, _yPosition,_direction);
    }
}