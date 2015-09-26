/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.en.clase;

import java.util.Scanner;

/**
 *
 * @author coreducacion
 */

    public class Grados{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double gradosC, gradosF;
      System.out.println("Introduce grados Centígrados:");
      gradosC = sc.nextDouble();
      gradosF = 32 + (9 * gradosC / 5);
      System.out.println(gradosC +" ºC = " + gradosF + " ºF");
  }
}

