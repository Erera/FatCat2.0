import javax.swing.*;

/**
 * Created by Erera on 14.06.2018.
 */
public class ResultProcessing extends JFrame {

    ResultProcessing(int result, double weight){
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setSize(300,400);
        this.setTitle("Fat Cat Result");
        this.getContentPane().setLayout(null);
        this.setLocationRelativeTo(null);
        this.resultOutputLabel(result);
        this.resLabel(result, weight);

    }

    private void resultOutputLabel(int result){

        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(25,10,200,20);
        if (result == 0){
            resultLabel.setText("Cat is fine");
        }
        if (result == 1){
            resultLabel.setText("Cat is fat");
        }
        if (result == 2){
            resultLabel.setText("Cat is thin");
        }
        this.add(resultLabel);
    }

    private void resLabel(int result, double weight){

        JTextArea textArea = new JTextArea(5, 20);
        textArea.setBounds(10,40,270,300);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        if (result == 0) {
            textArea.append("Your cat's weight is absolutely normal. \n " +
                    "Feed your cat as usually, diet is unnecessary.\n" +
                    "\n Remember that your cat should eat at least twice a day;\n" +
                    "\n if you feed your cat with natural food, it's recommended to give your cat " + String.format("%.2f", weight * 50 / 2) +
                    " grams of meat per day and " + String.format("%.2f", weight * 50 / 2) + " grams of fermented milk products. Also add 10-15 grams of vegetables per day;");
        }
        if (result == 1) {
            textArea.append("Your cat is overweight. \n " +
                    "You should give more attention to the diet of your cat. Here are some recommendations:\n" +
                    "\n- buy diet cat food and feed your cat according to the instructions written on the package;\n" +
                    "\n- if you feed your cat with natural food, it's recommended to give your cat " + String.format("%.2f",weight*45/2)+
                    " grams of meat per day and " + String.format("%.2f",weight*45/2) + " grams of fermented milk products. Also add 10-15 grams of vegetables per day;\n" +
                    "\n- don't overfeed the cat. Cats ask for food even if they are not hungry;\n" +
                    "\n- your cat should eat at least twice a day;");
        }
        if (result == 2) {
            textArea.append("Your cat is underweight. \n " +
                    "You should give more attention to the diet of your cat. Here are some recommendations:\n" +
                    "\n- buy cat food for cats with a lack of weight and feed your cat according to the instructions written on the package;\n" +
                    "\n- if you feed your cat with natural food, it's recommended to give your cat " + String.format("%.2f",weight*60/2)+
                    " grams of meat per day and " + String.format("%.2f",weight*60/2) + " grams of fermented milk products. Also add 10-15 grams of vegetables per day;\n" +
                    "\n- your cat should eat at least three times a day;");
        }

        textArea.setEditable(false);
        this.add(textArea);

    }


}
