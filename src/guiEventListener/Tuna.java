package guiEventListener;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Tuna extends  JFrame {// this lets us use a window

    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;

    //let's create a constructor
    public Tuna() {
        super("My Precious Ones");
        setLayout(new FlowLayout()); // this sets the layout ie how things are placed

        item1 = new JTextField(10);
        add(item1); // we've just added this to our window

        item2 = new JTextField("Enter text here");
        add(item2);

        item3 = new JTextField("uneditable", 20);
        item3.setEditable(false);
        add(item3);

        passwordField = new JPasswordField("mypass");
        add(passwordField);

        TheHandler handler = new TheHandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
    }

    //creating a new class now. A class within another class inherits all the stuff belonging to the outside class
    private class TheHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String string = "";
            if (event.getSource() == item1) {

                string = String.format("field 1: %s", event.getActionCommand());
            } else if (event.getSource() == item2) {

                string = String.format("field 2: %s", event.getActionCommand());
            } else if (event.getSource() == item3) {

                string = String.format("field 3: %s", event.getActionCommand());

            } else if (event.getSource() == passwordField) {

                string = String.format("password field is: %s", event.getActionCommand());
            }JOptionPane.showMessageDialog(null,string);
        }
    }

}