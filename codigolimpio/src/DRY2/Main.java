package DRY2;

public class Main {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate();
        MyDate myDate2 = new MyDate();
        MyDate myDate3 = new MyDate();

        myDate1.setYear(2000);
        myDate1.setMonth(2);
        myDate1.setDay(23);
        myDate1.setEra("A.C.");
        myDate1.setDayOfTheWeek(28);
        System.out.println(myDate1.toString());
  
        myDate2.setYear(2015);
        myDate2.setMonth(6);
        myDate2.setDay(28);
        myDate2.setEra("A.C.");
        myDate2.setDayOfTheWeek(2);
        System.out.println(myDate2.toString());

        myDate3.setYear(2024);
        myDate3.setMonth(12);
        myDate3.setDay(13);
        myDate3.setEra("A.C.");
        myDate3.setDayOfTheWeek(30);
        System.out.println(myDate3.toString());

    }
    
}
