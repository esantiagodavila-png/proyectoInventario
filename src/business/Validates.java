package business;

import java.util.Scanner;

public class Validates {

    Scanner sc = new Scanner(System.in);

    public String validateStr(String message){

        String toRead;
        System.out.print(message);
        toRead = sc.nextLine();

        while(toRead == null || toRead.trim().isEmpty()){

            System.out.println("Lectura invalida por favor vuelva a ingresar");
            System.out.print(message);
            toRead = sc.nextLine();

        }

        return toRead;

    }

    public int validateInt(String message){

        int amount;



        while(true){

            System.out.print(message);

            if(sc.hasNextInt()){
                amount = sc.nextInt();
                sc.nextLine();


                if(amount > 0){
                    return amount;
                }

                System.out.println("El número debe ser mayor a 0.");

            }else{
                System.out.println("Lectura inválida. Ingrese un numero entero.");
                sc.nextLine();
            }
        }



    }

    public double validateDouble(String message){

        double amount;
        System.out.print(message);


        while(true){

            System.out.print(message);

            if(sc.hasNextDouble()){
                amount = sc.nextDouble();
                sc.nextLine();


                if(amount > 0){
                    return amount;
                }

                System.out.println("El número debe ser mayor a 0.");

            }else{
                System.out.println("Lectura inválida. Ingrese un numero.");
                sc.nextLine();
            }
        }

    }

    public int validateIntRange(int lower, int up, String message){

        int amount;

        while(true){

            System.out.print(message);

            if(sc.hasNextInt()){
                amount = sc.nextInt();
                sc.nextLine();


                if(amount >= lower && amount <= up){
                    return amount;
                }

                System.out.println("El número debe estar entre: " + lower + " y " + up);

            }else{
                System.out.println("Lectura inválida. Ingrese un numero entero.");
                sc.nextLine();
            }
        }

    }

}
