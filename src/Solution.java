
import java.io.*;
import java.util.*;


// ENUNCIADO:

// Reduïm valors array:

/* Donat un array de valors enters, troba'n quin és el seu mínim, resta'l de tots els elements i imprimeix-lo per pantalla.

Input Format

N: tamany de l'array N nombres enters que es guarden a l'array.

Constraints

No n'hi ha.

Output Format

Es mostra la taula resultant d'aplicar la resta del valor mínim a tots els elements.

Sample Input 0

5
1 2 3 4 5
Sample Output 0

0 1 2 3 4
Explanation 0

Donat que el valor min és 1, apliquem la resta de 1 a tots els elements.

 */





public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int grosor = sc.nextInt();

        int miArray [] = new int [grosor];

        int minimo = 99999;

        for (int i = 0; i < grosor; i++)
        {
            miArray[i] = sc.nextInt();

            if (miArray[i] < minimo)
            {
                minimo = miArray[i];
            }
        }


        for (int i = 0; i < grosor; i++)
        {
            System.out.print((miArray[i] -minimo )+ " ");
        }

    }
}
