/**
 * Práctica 10 DAW - Programación.
 * 
 * 10.- Diseña un programa Java, denominado PROG02_Ejerc9, que realice las siguientes operaciones, en el orden que se muestran.
 * Se indica la variable y el tipo de dato que recibe el valor o resultado de la operación indicada:
 * 
 * @author Alejandro Alberola Gopar
 * @version 1.0
 * @since 06/11/2021
 */
package com.mycompany.prog02_ejerc10;

public class Main {
    public static void main(String[] args){
        System.out.println("------- Conversiones entre enteros y coma flotante -------");
        float x = 4.5f;
        float y = 3.0f;  
        int i = 2;
        int j = (int) (i*x); //Para operar dos tipo float en un int tenemos que hacer la corespondiente conversión.
        double dx = 2.0;
        double dz = dx*y; //En este caso no tenemos que hacer conversiones entre float y double.
        System.out.printf("Producto de int por float: j= i*x = %d\n",j);
        System.out.printf("Producto de float por double: dz=dx * y = %.1f\n\n",dz);//Simplemente escribimos los resultados por pantalla de las distintas conversiones de valores.
        System.out.println("------- Operaciones con byte -------");
        byte bx = 5;
        byte by = 2;
        byte bz = (byte) (bx-by);//Como en el primer apartado hemos de realizar la conversión correspondiente. Ya que estos se guardan como enteros y no como byte.
        System.out.printf("byte: %d - %d = %d\n",bx,by,bz);//Imprimimos por pantalla los resultados correspondientes a los valores.
        bx = -128;
        by = 1;
        bz = (byte)(bx-by); //Realizamos la misma operación que en el apartado anterior.
        System.out.printf("byte %d - %d = %d\n",bx,by,bz);
        int resulbz = bz;
        System.out.printf("(int)(%d - %d) = %d\n\n",bx,by,resulbz);
        System.out.println("------- Operaciones con short -------\n");
        short sx = 5;
        short sy = 2;
        short sz = (short) (sx-sy);//Nos oscurre el mismo caso que con los byte pero ahora con short.
        System.out.printf("short: %d - %d = %d\n",sx,sy,sz);
        sx = 32767;
        sy = 1;
        sz = (short)(sx+sy);
        System.out.printf("short %d + %d = %d\n\n",sx,sy,sz);//Como hemos comentado en los apartados anteriores simplemente imprimimos por pantalla.
        System.out.println("------- Operaciones con char -------\n");
        char cx = '\u000F';
        char cy = '\u0001';
        int z = cx - cy;//En este caso no es necesario hacer el cambio a tipo int en el entero z.
        System.out.printf("char:%s - %s = %d\n",cx,cy,z);//Imprimimos por pantalla y seguimos modificando valores.
        z = cx - 1;
        System.out.printf("char (%s) - 1 = %d\n",cx,z);//No se como imprimir para que me salga el valor '\u000F'.Como maximo se ponerlo como ((int)(cx)) que saldria como 15.
        cx = '\uFFFF';
        z = cx;//Ocurre lo mismo que en la variable z anterior no es necesario hacer el cambio de formato a int.
        System.out.printf("(int)(%s) = %d\n",cx,z);
        sx = (short)cx;//En este caso tenemos que cambiar 
        System.out.printf("(short)(%s) = %d\n",cx,sx);
        sx = -32768;
        cx = (char)sx;//Cambiamos formato de variables
        z = sx;//Cambiamos formato de variable y no es necesario insertar el int.
        //Forma en la que lo pondria para que me diera el resultado que nos pide z = z*-1;
        System.out.printf("%d short-char-int = %d\n",sx,z);//Creo que hay un error en el planteamiento ya que no da, en todo caso para que me diera como se pide cambiaria el valor de la variable *-1.
        sx = -1;
        cx = (char)sx;//Cambio de formato de variable.
        z = cx;//Como anteriormente no es necesario realizar el cambio de formato de la variable.
        System.out.printf("%d short-char-int = %d",sx,z);
        
    }
}
