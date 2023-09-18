package ejemplos;

import java.util.Scanner;

public class ClassMain {
    static boolean isPrimo(int numero){
        if(numero == 2){return true;}
        for(int i=2;i < (numero/2);i++){
            if(numero%i==0){
                return false;
            }
        }
        return true;
    }

    static int pedirNumero(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    static int sumarEnteros(int a,int b){
        return a+b;
    }

    static int test(int numero){
        while(true){
            if(isPrimo(numero)){
                break;
            }else{
                System.out.println("Introduce un numero primo");
                numero = pedirNumero();
            }
        }
        return numero;
    }

    static void fibonacci(int num){
        int a=1,b=1,c=0;
        if(num >= 2){
            System.out.println("1 \n" + "1");
        }
        while(c < num){
            c = a + b;
            a = b;
            b = c;
            if(c < num){
                System.out.println(c);
            }
        }
    }

    public static void main(String[] args) {
        int num1,num2;

        System.out.println("Introduce el primer numero");
        num1 = pedirNumero();
        num1 = test(num1);

        System.out.println("Introduce el segundo numero");
        num2 = pedirNumero();
        num2 = test(num2);

        System.out.println("Numero: " + num1 + "        Numero: " + num2);
        System.out.println("La suma de los numeros es :" + sumarEnteros(num1,num2));


        System.out.println("Introduce un numero para la lista de fibonacci");
        fibonacci(pedirNumero());
    }
}