public class Main {
    public static void main(String[] args) {
        Time Time =new Time(00,00,00);
        System.out.println();
        Time.setSec(59);
        Time.setMin(59);
        Time.setHour(23);
        Time.nextSecond();

        System.out.println("Second: "+Time.sec);
        System.out.println("Minute: "+Time.min);
        System.out.println("Hour: "+Time.hour);
        System.out.println("Time: "+Time);
        System.out.println();







        }
    }

