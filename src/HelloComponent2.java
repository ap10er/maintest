import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class HelloComponent2  extends JComponent implements MouseMotionListener
{
    String message;
     int messageX = 125, messageY = 95;

     public HelloComponent2(String message)
     {
         addMouseMotionListener(this);
     }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
