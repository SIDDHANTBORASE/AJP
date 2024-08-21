
    import java.awt.*;
    public class RadioCheckButton {

        RadioCheckButton(){

            Frame frame = new Frame();
            frame.setVisible(true);
            frame.setSize(500, 500);
            frame.setLayout(new FlowLayout());
            frame.setTitle("Radio and CheckBox");
            Checkbox checkbox = new Checkbox("CheckBox", false);
            Checkbox checkbox2 = new Checkbox("CheckBox2", false);
            CheckboxGroup cGroup = new CheckboxGroup();
            Checkbox cb1 = new Checkbox("Radio1", false, cGroup);
            Checkbox cb2 = new Checkbox("Radio2", false, cGroup);
            Checkbox cb3 = new Checkbox("Radio3", false, cGroup);

            frame.add(checkbox);
            frame.add(checkbox2);
            frame.add(cb1);
            frame.add(cb2);
            frame.add(cb3);

        }
        public static void main(String[] args) {
            RadioCheckButton f = new RadioCheckButton();
        }
    }