package Exersice1;
import java.awt.*;

public class NormalButtons {
NormalButtons(){
    Frame frm = new Frame("Buttons");
    frm.setVisible(true);
    frm.setSize(500,500);
    frm.setLayout(new FlowLayout());
    Button ok = new Button("OK");
    Button reset = new Button("RESET");
    Button cancle = new Button("CANCEL");
    frm.add(ok);
    frm.add(reset);
    frm.add(cancle);
}
public static void main(String Args[]){
    NormalButtons bt = new NormalButtons();
}
}
