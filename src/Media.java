import java.util.Scanner;
public class Media {

    public static void main(String args[]) {

        Calculo cal = new Calculo();
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a primeira nota: ");
        float num1 = sc.nextFloat();
        cal.setN1(num1);

        System.out.println("Digite a segunda nota: ");
        float num2 = sc.nextFloat();
        cal.setN2(num2);

        System.out.println("Digite a terceira nota: ");
        float num3 = sc.nextFloat();
        cal.setN3(num3);

        System.out.println("Digite a quarta nota: ");
        float num4 = sc.nextFloat();
        cal.setN4(num4);


        float f = new Float(cal.retornaMedia());
        

        if (f >= 7.0) {
            
        	System.out.println("Aprovado : " + f);
        
            
        }else if ( f >= 5.0 && f < 7.0 ) {
           
        	System.out.println("Recuperacao :  " + f);
        
        }else if (f < 5.0) {
        	System.out.println("Reprovado :  " + f);
        }
        
    }  
}
        