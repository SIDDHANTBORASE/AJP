import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicForm {
    BasicForm(){
        Frame frm = new Frame("Basic Form");
        frm.setVisible(true);
        frm.setSize(500,500);
        frm.setLayout(new FlowLayout());
        Label lb = new Label("Enter Name");
        frm.add(lb);
        TextField txt = new TextField(12);
        frm.add(txt);
        Label lb2 = new Label("Enter UserName");
        TextField txa = new TextField(12);
        Label lb3 = new Label("Enter Password");
        TextField txp = new TextField(12);
        txp.setEchoChar('*');
        Label lb4 = new Label("Enter Details: ");
        TextArea txd = new TextArea( "Enter Some Details",4,20);

        frm.add(lb2);
        frm.add(txa);
        frm.add(lb3);
        frm.add(txp);
        frm.add(lb4);
        frm.add(txd);

        Button newbotton = new Button("Submit");
        newbotton.setBackground(Color.RED);
        frm.add(newbotton);

        newbotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Submitted successfully");
            }
        });
        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

    }
    public static void main(String args[]){
        BasicForm f = new BasicForm();
    }
}
