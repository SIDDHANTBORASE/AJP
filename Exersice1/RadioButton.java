package Exersice1;
import java.awt.*;

public class RadioButton {
    RadioButton(){
        Frame frm = new Frame("Radio Button");
        frm.setVisible(true);
        frm.setSize(500,500);
        frm.setLayout(new FlowLayout());

        Checkbox cgb1 = new Checkbox("Marathi", false );
        Checkbox cgb2 = new Checkbox("Hindi", false );
        Checkbox cgb3 = new Checkbox("English", false );
        Checkbox cgb4 = new Checkbox("Sanskrit", false);
        frm.add(cgb1);
        frm.add(cgb2);
        frm.add(cgb3);
        frm.add(cgb4);
    }
    public static void main(String Args[]){
        RadioButton rb = new RadioButton();
    }
}
