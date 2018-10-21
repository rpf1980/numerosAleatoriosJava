package com.company;

import java.util.Random;
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
        System.out.println("[10] 20 calificaciones");       //**NO ENTIENDO ALGORITMO QUE USA
        System.out.println("[11] Dados del mismo valor");
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

                Random rd = new Random();
                int sumaPuntos, i, tirada;
                sumaPuntos = 0;

                for (i = 1; i <= 3; i++)
                {
                    tirada = rd.nextInt(6)+1;
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

                Random rd = new Random();
                String palo = "";
                String carta = "";

                int numeroPalo = rd.nextInt(4)+1;
                int numeroCarta = rd.nextInt(13)+1;

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

                Random rd = new Random();
                String palo = "";
                String carta = "";
                int numeroPalo = rd.nextInt(4);
                int numeroCarta = rd.nextInt(11)+1;

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

                Random rd = new Random();
                int n;
                int i;

                for (i = 0; i < 20; i++)
                {
                    n = rd.nextInt(11);
                    System.out.print(n + " ");
                }
            }
            break;

            case 5:
            {
                //Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
                //separados por espacios. Muestra el máximo, el mínimo y la media de esos números.

                Random rd = new Random();

                int max, min, suma, media;
                suma = 0;
                int i, n;
                max = 199;
                min = 100;


                for (i = 0; i < 50; i++)
                {
                    n = rd.nextInt(100)+100;
                    System.out.print(n + "  ");
                    suma += n;

                    if(n < min)
                    {
                        min = n;
                    }
                    if(n > max)
                    {
                        max = n;
                    }
                }
                System.out.println("\nMAXIMO = " + max);
                System.out.println("MINIMO = " + min);
                media = suma / 50;
                System.out.println("MEDIA = " + media);
            }
            break;

            case 6:
            {
                //Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
                //adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el
                //programa dirá cuántas oportunidades quedan y si el número introducido es menor o
                //mayor que el que ha pensado.

                Random rd = new Random();
                int n;
                int intentos;
                int azar = rd.nextInt(101);

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

                Random rd = new Random();
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
                        resultadoPartido = rd.nextInt(3)+1;
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

                Random rd = new Random();
                int n = 0;
                int cuentaNumero = 0;

                while(n != 24)
                {
                    n = rd.nextInt(51)*2;
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

                Random rd = new Random();
                int longitud;
                int r;
                String relleno = "";

                for(int i = 1; i <= 10; i++)
                {
                    longitud = rd.nextInt(40)+1;
                    r = rd.nextInt(6)+1;

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

            case 10:
            {
                //Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la
                //forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de
                //suspensos, el número de suficientes, el número de bienes, etc.

                Random rd = new Random();

                int nota, i;
                int suspensos = 0;
                int suficientes = 0;
                int bienes = 0;
                int notables = 0;
                int sobresalientes = 0;

                for(i = 0; i < 20; i++)
                {
                    nota = rd.nextInt(11);
                    if(nota >= 0 && nota < 5)
                    {
                        System.out.println(nota + " = Suspenso");
                        suspensos++;
                    }
                    else
                    {
                        if(nota >= 5 && nota < 6)
                        {
                            System.out.println(nota + " = Suficiente");
                            suficientes++;
                        }
                        else
                        {
                            if(nota >= 6 && nota <= 7)
                            {
                                System.out.println(nota + " = Bien");
                                bienes++;
                            }
                            else
                            {
                                if(nota > 7 && nota < 9)
                                {
                                    System.out.println(nota + " = Notable");
                                    notables++;
                                }
                                else
                                {
                                    if(nota >= 9 && nota <= 10)
                                    {
                                        System.out.println(nota + " = Sobresaliente");
                                        sobresalientes++;
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.println("\nSUFICIENTES = " + suficientes);
                System.out.println("BIENES = " + bienes);
                System.out.println("NOTABLES = " + notables);
                System.out.println("SOBRESALIENTES = " + sobresalientes);
            }
            break;

            case 11:
            {
                //Escribe un programa que simule la tirada de dos dados. El programa deberá
                //continuar tirando los dados una y otra vez hasta que en alguna tirada los
                //dos dados tengan el mismo valor.

                /*int dado1 = (int)(Math.random()*6+1);
                int dado2 = (int)(Math.random()*6+1);*/

                Random rd = new Random();
                int dado1 = 0;
                int dado2 = 1;

                while(dado1 != dado2)
                {
                    dado1 = rd.nextInt(6)+1;
                    dado2 = rd.nextInt(6)+1;
                    System.out.println(dado1);
                    System.out.println(dado2);
                }
                System.out.println("Termina juego dado1 = " + dado1);
                System.out.println("Termina juego dado2 = " + dado2);
            }
            break;
        }
    }
}
