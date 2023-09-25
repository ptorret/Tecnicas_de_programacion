package ejemplos;

import java.util.ArrayList;
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
        //Suma de dos primos
        /*int num1,num2;

        System.out.println("Introduce el primer numero");
        num1 = pedirNumero();
        num1 = test(num1);

        System.out.println("Introduce el segundo numero");
        num2 = pedirNumero();
        num2 = test(num2);

        System.out.println("Numero: " + num1 + "        Numero: " + num2);
        System.out.println("La suma de los numeros es :" + sumarEnteros(num1,num2));


        System.out.println("Introduce un numero para la lista de fibonacci");
        fibonacci(pedirNumero());*/

        //Ejercicio de array

        /*Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>() ;
        String number;
        while (true){
            number = sc.nextLine();
            if(number.equals("x")){break;}
            numeros.add(Integer.valueOf(number));
        }

        for(int i=0;i<numeros.size();i++){
            System.out.print(numeros.get(i) + " ,");
        }


        for(int num:numeros){
            System.out.print(num + " ,");
        }*/

        //Ejercicion de String

        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();

        for(int i=0;i<palabra.length();i++){
            System.out.println(palabra.charAt(i));
        }
        for(int j=palabra.length()-1;j>=0;j--){
            System.out.println(palabra.charAt(j));
        }

        System.out.println("El numero de letras es : " + palabra.length());

        for(int i=0;i<palabra.length();i++){
            switch (palabra.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    continue;
                default:
                    System.out.println(palabra.charAt(i));
            }
        }
    }
}
