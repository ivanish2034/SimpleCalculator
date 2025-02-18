
package simplecalculator;


public class CalculatorApp {


    public static void main(String[] args) {
     java.awt.EventQueue.invokeLater(new Runnable() {

        public void run() {
            new CalculatorGUI().setVisible(true);
        }
    });
    }
    
}
