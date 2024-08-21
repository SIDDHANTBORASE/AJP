package Exercise2;
import java.awt.*;

public class List2 {
    List2(){

        Frame frm = new Frame("List Implement");
        frm.setVisible(true);
        frm.setSize(500,500);
        frm.setLayout(null);
        List n = new List();
        n.add("Lokmat");
        n.add("Sakal");
        n.add("Maharashtra Times");
        n.add("Loksatta");
        n.add("Kesari");
        n.add("The Times of India ");
        n.add("The Indian Express");
        n.add("Mumbai Mirror");
        n.add("The Hindu");
        n.add("Hindustan Times");
        n.setBounds(200,200,150,100);
        frm.add(n);
    }
    public static void main(String args[]){

        List2  l = new List2();
    }
}
