import javax.swing.JOptionPane;

public class Ex10 {
    public static void main(String[] args){
        String name =  JOptionPane.showInputDialog("What is your name?");
        System.out.println(name);

        String doo =  JOptionPane.showInputDialog("My name is Fatima! What would you like me to do?");
        System.out.println(doo);

        JOptionPane.showMessageDialog(null,"I'm sorry, "+name+". I'm afraid I can't do that.");
    }
}
