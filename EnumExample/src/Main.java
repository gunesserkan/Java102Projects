/**
 * Author: gunes
 * Project: EnumExample
 * E-mail: gunesserkan883@gmail.com
 * Creation Date: 3/17/2024 10:52 PM
 */
public class Main {
    public static void main(String[] args) {
        //Enum olmadan kullanım
        System.out.println(Day.MONDAY.getDay());

        //Enum kullanım
        System.out.println(DayEnum.MONDAY.getDay());

        DayEnum.MONDAY.getDayName();
    }
}
