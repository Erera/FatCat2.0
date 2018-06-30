/**
 * Created by Erera on 08.06.2018.
 */

public class Cat {
    double weight;
    int sex;
    int size;


    Cat(){}
    Cat(int sex, int size, double weight){
        this.weight = weight;
        this.sex = sex;
        this.size = size;
    }


    public double idealMinWeightCalculate(){
       return 2.5 + this.sex*0.9 + this.size*1.1;
    }

    public int weightResult(){

        int result = 0;

        if (this.weight>idealMinWeightCalculate() && this.weight<idealMinWeightCalculate() + 1.5){result = 0;}
        if (this.weight>idealMinWeightCalculate()+1.5){result = 1;}
        if (this.weight<idealMinWeightCalculate()){result = 2;}

        return result;
    }

}
