package week1;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        double salary;
        double hours;
        int weekDay;

        System.out.println("Lütfen maaşınızı giriniz:");
        salary = new Scanner(System.in).nextDouble();

        if (salary >= 1000) {

            System.out.println("Bu hafta toplamda kaç saat çalıştınız?");
            hours = new Scanner(System.in).nextDouble();

            if (hours == 40) {
                System.out.println("Bu ay alacağın toplam maaş: " + salary);

            } else if (hours < 40) {
                double lowTime = (40 - (hours));
                System.out.println("Bu ay alacağın toplam maaş: " + (salary - (lowTime * (salary / (30 * 8) * 0.5))));

            } else {
                System.out.println("Haftanın hangi günü mesai yaptınız? (Örn: Haftanın birinci günü ise 1, ikinci güne ise 2... )");
                weekDay = new Scanner(System.in).nextInt();
                double overTime = ((hours) - 40);

                switch (weekDay) {
                    case 1:
                        System.out.println("Bu ay alacağın toplam maaş: " + (salary + (overTime * (salary / (30 * 8) * 1.5))));
                }
                switch (weekDay) {
                    case 2:
                        System.out.println("Bu ay alacağın toplam maaş: " + (salary + (overTime * (salary / (30 * 8) * 1.5))));
                }
                switch (weekDay) {
                    case 3:
                        System.out.println("Bu ay alacağın toplam maaş: " + (salary + (overTime * (salary / (30 * 8) * 1.5))));
                }
                switch (weekDay) {
                    case 4:
                        System.out.println("Bu ay alacağın toplam maaş: " + (salary + (overTime * (salary / (30 * 8) * 1.5))));
                }
                switch (weekDay) {
                    case 5:
                        System.out.println("Bu ay alacağın toplam maaş: " + (salary + (overTime * (salary / (30 * 8) * 1.5))));
                }
                switch (weekDay) {
                    case 6:
                        if(overTime>=10){
                            System.out.println("Tebrikler bu ay 500$ ikramiyeyi hak ettiniz.");
                            System.out.println("Bu ay ikramiyeniz ile alacağınız toplam maaş: " + (salary + (overTime * (salary / (30 * 8) * 2)) + 500));
                        }else
                            System.out.println("Bu ay alacağın toplam maaş: " + (salary + (overTime * (salary / (30 * 8) * 2))));
                }
                switch (weekDay) {
                    case 7:
                        if(overTime>=10){
                            System.out.println("Tebrikler bu ay 500$ ikramiyeyi hak ettiniz.");
                            System.out.println("Bu ay ikramiyeniz ile alacağınız toplam maaş: " + (salary + (overTime * (salary / (30 * 8) * 2)) + 500));
                        }else
                            System.out.println("Bu ay alacağın toplam maaş: " + (salary + (overTime * (salary / (30 * 8) * 2))));
                }
            }
        }
        else
            System.out.println("Girilen maaş en az 1000 olmalıdır. Lütfen kontrol ediniz...");
    }
}

