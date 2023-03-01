import java.text.MessageFormat;

public class MarsRover {
    private int _yPosition;
    private int _xPosition;
    private String _direction ="N";
    private int _grid;

    public MarsRover(int grid) {
        _grid = grid;
    }

    public String execute(String command) {
        for (var item:command.toCharArray())
        {
            if(_yPosition ==_grid-1){
                _yPosition=0;
            }
            else {
                _yPosition += 1;
            }
        }

        return MessageFormat.format(
                "{0}:{1}:{2}", _xPosition, _yPosition,_direction);
    }
}