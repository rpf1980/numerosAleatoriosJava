package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("===============");
        System.out.println("MENÚ ALEATORIOS");
        System.out.println("===============");
        System.out.println("[1] 3 Dados casino");
        System.out.println("[2] Baraja Francesa");
        System.out.println("[3] Baraja Española");
        System.out.println("[4] 20 aleatorios entre 0 y 10");
        System.out.println("[5] 50 aleatorios SUMA y MEDIA");
        System.out.println("[6] Número secreto");
        System.out.println("[7] Quiniela");
        System.out.println("[8] Recuento de aleatorios | nº 24");
        System.out.println("[9] Pinta 10 líneas con caracteres");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println("[] ");
        System.out.println();
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                //Escribe un programa que muestre la tirada de tres dados.
                //Se debe mostrar también la suma total (los puntos que suman
                //entre los tres dados).

                System.out.println("TIRADA DE DADOS");

                int sumaPuntos, i, tirada;
                sumaPuntos = 0;

                for (i = 1; i <= 3; i++)
                {
                    tirada = (int) (Math.random() * 6 + 1);
                    System.out.println("DADO " + i + " = " + tirada + " ");
                    sumaPuntos += tirada;
                }
                System.out.println("Total puntos = " + sumaPuntos);
            }
            break;

            case 2:
            {
                //Realiza un programa que muestre al azar el nombre de una carta de
                //la baraja francesa. Esta baraja está dividida en cuatro palos: picas,
                //corazones, diamantes y tréboles. Cada palo está formado por 13 cartas,
                //de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7,
                //8, 9, 10, J, Q, K y A (que sería el 1). Para convertir un número en
                //una cadena de caracteres podemos usar String.valueOf(n).

                System.out.println("CARTA AL AZAR");

                String palo = "";
                String carta = "";

                int numeroPalo = (int) (Math.random() * 4 + 1);
                int numeroCarta = (int) (Math.random() * 13 + 1);

                switch (numeroPalo)
                {
                    case 1:
                        palo = "picas";
                        break;
                    case 2:
                        palo = "corazones";
                        break;
                    case 3:
                        palo = "diamantes";
                        break;
                    case 4:
                        palo = "tréboles";
                        break;
                    default:
                        palo = "Error de escritura";
                }

                switch (numeroCarta)
                {
                    case 1:
                        carta = "As";
                        break;
                    case 11:
                        carta = "Q";
                        break;
                    case 12:
                        carta = "J";
                        break;
                    case 13:
                        carta = "K";
                        break;
                    default:
                        carta = String.valueOf(numeroCarta);
                        break;
                }

                System.out.println(carta + " de " + palo);
            }
            break;

            case 3:
            {
                //Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de
                //48 cartas: 2, 3, 4, 5, 6, 7, 8, 9, sota, caballo, rey y as.

                String palo = "";
                String carta = "";
                int numeroPalo = (int) (Math.random() * 4);
                int numeroCarta = (int) (Math.random() * 11 + 1);

                switch (numeroPalo)
                {
                    case 0:
                        palo = "oro";
                        break;
                    case 1:
                        palo = "copas";
                        break;
                    case 2:
                        palo = "bastos";
                        break;
                    case 3:
                        palo = "espadas";
                        break;
                    default:
                        palo = "";
                        break;
                }
                switch (numeroCarta)
                {
                    case 1:
                        carta = "As";
                        break;
                    case 8:
                        carta = "Sota";
                        break;
                    case 9:
                        carta = "Caballo";
                        break;
                    case 10:
                        carta = "Rey";
                        break;
                    default:
                        carta = String.valueOf(numeroCarta);
                        break;
                }

                System.out.println(carta + " de " + palo);
            }
            break;

            case 4:
            {
                //Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
                //separados por espacios.

                int i;

                for (i = 0; i < 20; i++)
                {
                    System.out.print((int) (Math.random() * 11) + " ");
                }
            }
            break;

            case 5:
            {
                //Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
                //separados por espacios. Muestra el máximo, el mínimo y la media de esos números.

                int max, min, suma, media;
                suma = 0;
                int i, n;


                for (i = 0; i < 50; i++)
                {
                    n = (int) (Math.random() * 10 + 1);
                    System.out.print(n + "  ");
                    suma += n;
                }
                System.out.println();
                System.out.println("Suma = " + suma);
                media = suma / 50;
                System.out.println("Media = " + media);
            }
            break;

            case 6:
            {
                //Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
                //adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el
                //programa dirá cuántas oportunidades quedan y si el número introducido es menor o
                //mayor que el que ha pensado.

                int n;
                int intentos;
                int azar = (int) (Math.random() * 101);

                System.out.print("Escribe un número: ");
                n = sc.nextInt();
                intentos = 1;

                if (n == azar)
                {
                    System.out.println("Enhorabuena, acertaste a la primera");
                } else
                {
                    if (n < azar)
                    {
                        System.out.println("Tu número es menor");
                        System.out.print("Escribe un número: ");
                        n = sc.nextInt();
                        intentos++;
                    } else
                    {
                        System.out.println("Tu número es mayor");
                        System.out.print("Escribe un número: ");
                        n = sc.nextInt();
                        intentos++;
                    }
                }

                System.out.println("Número correcto");
                System.out.println("Intentos = " + intentos);
            }
            break;

            case 7:
            {
                //Escribe un programa que muestre tres apuestas de la quiniela en
                //tres columnas para los partidos y el pleno al quince (15 filas).

                int resultadoPartido;
                int columnas = 3;

                for (int fila = 1; fila <= 15; fila++)
                {
                    System.out.printf("%4d. |", fila);

                    if (fila == 15)
                    {
                        columnas = 1;
                    }

                    for (int apuesta = 1; apuesta <= columnas; apuesta++)
                    {
                        resultadoPartido = (int) (Math.random() * 3 + 1);
                        switch (resultadoPartido)
                        {
                            case 1:
                                System.out.print("1  |");
                                break;
                            case 2:
                                System.out.print("  2|");
                                break;
                            case 3:
                                System.out.print(" X |");
                            default:
                        }
                    }
                    System.out.println();

                }
            }
            break;

            case 8:
            {
                //Realiza un programa que vaya generando números aleatorios pares
                //entre 0 y 100 y que no termine hasta que no saque el número 24. El
                //programa deberá decir al final cuántos números se han generado.

                int n = 0;
                int cuentaNumero = 0;

                while(n != 24)
                {
                    n = (int)(Math.random()*51 * 2);
                    System.out.print(n + "  ");
                    cuentaNumero++;
                }
                System.out.println("\n Se han generado " + cuentaNumero + " números");
            }
            break;

            case 9:
            {
                //Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
                //El carácter con el que se pinta cada línea se elige de forma aleatoria entre
                //uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
                //aleatoria entre 1 y 40 caracteres.

                int longitud;
                int r;
                String relleno = "";

                for(int i = 1; i <= 10; i++)
                {
                    longitud = (int)(Math.random()*40+1);
                    r = (int)(Math.random()*6+1);

                    switch (r)
                    {
                        case 1: relleno = "*"; break;
                        case 2: relleno = "-"; break;
                        case 3: relleno = "="; break;
                        case 4: relleno = "."; break;
                        case 5: relleno = "|"; break;
                        case 6: relleno = "@"; break;
                        default:{}break;
                    }
                    for(int j = 1; j <= longitud; j++)
                    {
                        System.out.print(relleno);
                    }
                    System.out.println();
                }

            }
            break;
        }
    }
}
