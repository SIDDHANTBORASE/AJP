package Exercise2;

import java.awt.*;

public class List1 {
    List1(){

        Frame frm = new Frame("List Implement");
        frm.setVisible(true);
        frm.setSize(500,500);
        frm.setLayout(null);
        List n = new List();
        n.add("Mumbai");
        n.add("Thane");
        n.add("Kurla");
        n.add("Delhi");
        n.add("Mumbra");
        n.add("Diva");
        n.add("Dadar");
        n.add("Kalyan");
        n.add("Kopar");
        n.add("Dombivali");
        n.setBounds(100,100,100,170);
        frm.add(n);
    }
    public static void main(String args[]){
        List1  l = new List1();
    }
}
