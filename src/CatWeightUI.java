/**
 * Created by Erera on 08.06.2018.
 */
import  java.awt.event.*;
import javax.swing.*;

public class CatWeightUI extends JFrame {


    CatWeightUI() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(600, 250);
        this.setTitle("Fat Cat");
        this.getContentPane().setLayout(null);//менеджер размещения компонентов окна
        this.setLocationRelativeTo(null);//центрирование окна
        this.labels();


        JTextField catWeightField = new JTextField();
        catWeightField.setBounds(330,50,200,30);
        this.add(catWeightField);


        String [] sexVariant = new String[] {"Female","Male"};
        JComboBox catSex = new JComboBox(sexVariant);
        catSex.setBounds(20,50,100,30);
        catSex.setSelectedIndex(1);//значение по умолчанию - самец
        this.add(catSex);


        String[] sizeVariant = new String[] {"Little", "Medium","Big"};
        JComboBox catSize = new JComboBox(sizeVariant);
        catSize.setBounds(150,50,150,30);
        catSize.setSelectedIndex(1); // по умолчанию средний котик
        this.add(catSize);


        JButton calcButton = new JButton("Calculate!");
        calcButton.setBounds(20,100,100,40);
        this.add(calcButton);
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (catWeightField.getText().equals("")){
                    ErrorClass error = new ErrorClass("Please insert your cat's weight");
                    error.setVisible(true);
                    return;}


                else {
                    try {Double.parseDouble(catWeightField.getText());}
                    catch (NumberFormatException err){
                        ErrorClass error = new ErrorClass("Please insert weight correctly");
                        error.setVisible(true);
                        return;}

                    if (Double.parseDouble(catWeightField.getText()) <= 0){
                        ErrorClass error = new ErrorClass("Are you sure that your cat exists?");
                        error.setVisible(true);
                        return;}

                    Cat kitty = new Cat((catSex.getSelectedIndex()), catSize.getSelectedIndex(),
                            Double.parseDouble(catWeightField.getText()));

                    ResultProcessing resultOutput = new ResultProcessing(kitty.weightResult(),
                            Double.parseDouble(catWeightField.getText()));
                    resultOutput.setVisible(true);
                }
            }
        });

    }
    private void labels(){

        JLabel helloLabel = new JLabel("Enter your cat's parameters:");
        helloLabel.setBounds(30,10,200,18);
        this.add(helloLabel);

        JLabel sexLabel = new JLabel("Your cat's sex is:");
        sexLabel.setBounds(20,30,150,20);
        this.add(sexLabel);

        JLabel sizeLabel = new JLabel("Your cat's size is:");
        sizeLabel.setBounds(150,30,150,20);
        this.add(sizeLabel);

        JLabel weightLabel = new JLabel("Enter your cat's weight in kg:");
        weightLabel.setBounds(330,30,200,18);
        this.add(weightLabel);
    }


}
