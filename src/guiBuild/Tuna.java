package guiBuild;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tuna extends JFrame{
    private JLabel item1;

    public Tuna(){
        super("The title bar");
        setLayout(new FlowLayout()); // this gives us the default layout
        item1 = new JLabel("Dev Olawunmi, you are cool");
        item1.setToolTipText("this shows up on hover");
        add(item1);
    }
}

