public class Main {
    public static void main(String[] args) {
        int number = 0;
        int remainder = number % 2;
        boolean isPrime = true;
        if (number==1){
            System.out.println("ASAL SAYI DEĞİLDİR");
            return;
        }
        if (number<1){
            System.out.println("GEÇERSİZ SAYI GİRDİNİZ");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
             isPrime=false;
            }
        }
            if (isPrime==true){
                System.out.println("ASAL SAYIDIR");
            }
            else {
                System.out.println("ASAL SAYI DEĞİLDİR");
            }

            }
        }

