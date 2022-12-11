public class Main {
    public static void main(String[] args) {
        char harf ='A';
        switch (harf){
            case 'A':
            case 'I':
            case 'U':
            case 'O':
            System.out.println("KALIN SESLİ HARF");
            break;

        case 'E':
        case 'İ':
        case 'Ü':
        case 'Ö':
        System.out.println("İNCE SESLİ HARF");
        break;
            default:
                System.out.println("BÜYÜK HARF OLACAK ŞEKİLDE SESLİ HARF GİRİNİZ.");

        }




    }
}