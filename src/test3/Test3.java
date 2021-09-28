/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Прошу введте своё имя: ");
        String Name = scanner.nextLine();
        System.out.printf("Фамилию: ");
        String Sname = scanner.nextLine();
        System.out.printf("В цифрах\nГод рождения: ");
        int Year = scanner.nextInt();
        System.out.printf("Месяц рождения: ");
        int Month = scanner.nextInt();
        System.out.printf("День рождения: ");
        int Day = scanner.nextInt();
        System.out.println("");
        System.out.printf(Name+" "+Sname+" Родился "+Day+"."+Month+"."+Year);
    }
}
    

