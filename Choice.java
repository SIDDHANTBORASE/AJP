import java.awt.*;

public class Choice {
    Choice(){
        Frame frm = new Frame("Applet Viewer:AppChoice");
        frm.setVisible(true);
        frm.setSize(500,500);
        frm.setLayout(null);
        Label lb = new Label("Applet");
        lb.setBounds(10,50,100,20);
        java.awt.Choice n = new java.awt.Choice();
        n.add("Summer");
        n.add("Winter");
        n.add("Rainy");
        n.setBounds(100,100,100,100);
        Label lb2 = new Label("Applet Started");
        lb2.setBounds(10,450,100,20);
        frm.add(lb);
        frm.add(n);
        frm.add(lb2);
    }
    public static void main(String Args[]){
        Choice lc = new Choice();

    }
}
