/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv22myfirstproject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Date;
/**
 *
 * @author pupil
 */
public class JKTV22MyFirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        System.out.println("Укажите имя и фамилию через пробел:");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        System.out.println("Hello, " + firstName + " " + lastName + "!");
        
        System.out.print("Укажите дату рождения в формате гггг-мм-дд: ");
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
        LocalDate currentDate = LocalDate.now();
        Date birthday = ft.parse(scanner.next());
        System.out.println(birthday);
        System.out.println(currentDate);
    }
    
}
