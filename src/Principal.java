import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        String A = "****************************************";
        String menu = """
                1 - Sumar
                2 - Restar
                3 - Dividir
                4 - Multiplicar
                9 - Salir
                
                Elija la opcion que deseas realizar""";
        String menu2 = """
                Deseas continuar o salir del program?
                
                1 - Seguir
                9 - salir""";

        System.out.println(A);
        System.out.println("   Bienvenidos a MoteteRD calculadora\n   ");

        boolean condicion = true;
        int opciones = 0;
        double numero1 = 0;
        double numero2 = 0;

        while(condicion){
            System.out.println(menu);
            System.out.println(A);
            opciones = lectura.nextInt();
            if (opciones == 9) {condicion = false;}

            switch (opciones){
                case 1:
                    System.out.println("Ingrese el primer valor que deseas");
                    numero1 = lectura.nextDouble();
                    System.out.println("Ingrese el segundo valor que deseas");
                    numero2 = lectura.nextDouble();
                    numero1 += numero2;
                    System.out.println("la valor final es: " + numero1 + "\n");
                    System.out.println(A);


                    System.out.println(menu2);
                    opciones = lectura.nextInt();
                    if (opciones == 1) {condicion = true;}
                    else {condicion = false;}

                    break;
                case 2:
                    System.out.println("Ingrese el primer valor que deseas");
                    numero1 = lectura.nextDouble();
                    System.out.println("Ingrese el segundo valor que que deseas");
                    numero2 = lectura.nextDouble();
                    numero1 -= numero2;
                    System.out.println("la valor final es: " + numero1 + "\n");
                    System.out.println(A);

                    System.out.println(menu2);
                    opciones = lectura.nextInt();
                    if (opciones == 1) {condicion = true;}
                    else {condicion = false;}

                    break;
                case 3:
                    System.out.println("Ingrese el primer valor que deseas");
                    numero1 = lectura.nextDouble();
                    System.out.println("Ingrese el segundo valor que deseas");
                    numero2 = lectura.nextDouble();
                    numero1 /= numero2;
                    System.out.println("la valor final es: " + numero1 + "\n");
                    System.out.println(A);

                    System.out.println(menu2);
                    opciones = lectura.nextInt();
                    if (opciones == 1) {condicion = true;}
                    else {condicion = false;}

                    break;
                case 4:
                    System.out.println("Ingrese el primer valor que deseas");
                    numero1 = lectura.nextDouble();
                    System.out.println("Ingrese el segundo valor que deseas");
                    numero2 = lectura.nextDouble();
                    numero1 *= numero2;
                    System.out.println("la valor final es: " + numero1 + "\n");
                    System.out.println(A);

                    System.out.println(menu2);
                    opciones = lectura.nextInt();
                    if (opciones == 1) {condicion = true;}
                    else {condicion = false;}

                    break;
                case 9:
                    break;
                default:
                    System.out.println("lo sentimos esta opcion es invalidad");
                    System.out.println(A);
                    break;
            }
        }

        System.out.println("Gracias por utilizar nuestro servicios");

    }
}