import javax.swing.*;

/**
 * Created by Erera on 09.06.2018.
 */
public class ErrorClass extends JFrame {

    ErrorClass(String errorNumber) {

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setSize(300,100);
        this.setTitle("Error");
        this.getContentPane().setLayout(null);
        this.setLocationRelativeTo(null);

        JLabel errorLabel = new JLabel();
        errorLabel.setBounds(2,2,280,20);
        errorLabel.setText(errorNumber);
        this.add(errorLabel);
    }
}
