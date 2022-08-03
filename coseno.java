package ejemplos;
import java.util.Scanner;

public class coseno {

    public static void main(String[] args){

        //valor n con el que empieza la serie
        int n = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el angulo (x): ");
        double anguloX = sc.nextDouble();
        double angulo = anguloX *(3.141592654/180);

        System.out.print("Ingrese las interaciones (i): ");
        int iteI = sc.nextInt();

        double resultadoCos = 0;

        for(int k = 1; k <= iteI; k++){

            resultadoCos += ((potencia(n)) * ((potencia2(angulo, n))/(factorial(n))));
            n++;
        }
        System.out.println("Cos(" + anguloX + ") =" + resultadoCos);      
        
    }

    /**
     * va a entrar a la funcion -> n
     * para saber si es Negativo(-) o Positivo(+)
     */ 
    public static double potencia(int num){
        // numero1 = -1 = base
        double numero1 = -1;

        // numero n = potencia = num el que entra a la función = potencia

        double answer = 1;
        //numero1 = base
        //numero2 = exponente = n
        if(num == 0){
            return answer;
        }else{
            for(int i = 1; i <= num; i++){
                answer = (answer)*(numero1);
            }
            return answer;
        }      
    }

    public static double potencia2(double angulo, int n){

        //va a entrar angulo ---> base
        //va a entrar n --------> exponente

        int num = (n * 2);
        double answer = 1;

        for(int i = 1; i <= num; i++){
             answer = (answer)*(angulo);
        }
        return answer;   
    }

    public static double factorial(int number){

        int num = (2 * number);

        if ( num == 1){
            return 1;
        } else {
            double factorial = num;
            double i = num -1;
            do{
                factorial = factorial * i ;
                i--;
            }while( i > 0);
            return factorial;
        }
    }

    
}
