import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Bug extends JFrame {

    public Bug() {
        
       setTitle("Simple example");
       setSize(300, 200);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);        
    }    

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Bug ex = new Bug();
                ex.setVisible(true);
            }
        });
    }
}