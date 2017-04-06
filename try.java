
import objectdraw.*;
import java.awt.*;

public class middie extends WindowController{

    public static void main(String[] args) {
    new middie().startController(800,800);
   }

  private Text wordy;
 
  public void onMouseClick ( Location point ) {
    wordy = new Text ("CENTURRRRR", (canvas.getWidth()/2), (canvas.getHeight()/2), canvas);
    wordy.moveTo(canvas.getWidth()/2 - wordy.getWidth()/2, canvas.getHeight()/2 - wordy.getHeight()/2 );

   }

}

