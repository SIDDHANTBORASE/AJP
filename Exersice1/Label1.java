package Exersice1;
import java.awt.*;
public class Label1 extends Frame{
    Label1(){
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        java.awt.Label lb = new java.awt.Label("Welcome to Java");
        add(lb);

    }
    public static void main(String Args[]){
        Label1 l = new Label1();
    }
}
