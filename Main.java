import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Tres numeros y orden");

        Scanner sc = new Scanner(System.in);

        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();

        sc.close();

        if(number1>number2 && number3>number2){
            System.out.println(number1 +" > "+ number3 +" > "+ number2);
        }else{
            if(number3>number2 && number2>number1){
                System.out.println(number3 +" > "+ number2 +" > "+ number1);
            }if(number2>number3 && number3>number1){
                System.out.println(number2 +" > "+ number3 +" > "+ number1);
            }if(number2>number3 && number1>number3){
                System.out.println(number2 +" > "+ number1 +" > "+ number3);
            }if(number1==number3 && number2==number3){
                System.out.println(number1 +" = "+ number2 +" = "+ number3);
            }else{
                System.out.println("Un nuero es igual a otro");
            }
        }
    }
}