/**
 * Author: gunes
 * Project: EnumExample
 * E-mail: gunesserkan883@gmail.com
 * Creation Date: 3/17/2024 10:56 PM
 */
public enum DayEnum {
    MONDAY(1),
    TUESDAY(2),
    WEDNEDDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    private int day;

    DayEnum(int day) {
        this.day = day;
    }

    public void getDayName() {
        switch (this.day) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Perşembe");
                break;
            case 7:
                System.out.println("Pazar");
                break;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
