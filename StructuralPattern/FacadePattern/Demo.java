import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
        System.out.println("Welcome to mobile shop");
        System.out.println("We have phones of 1)Iphone \n 2) Samsung \n 3) Realme ");
        System.out.println("Which one do want details of");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        MobileShop ms = new MobileShop();
        switch(opt){
            case 1:
                ms.showIphone();
                break;
            case 2:
                ms.showSamsung();
                break;
            case 3:
                ms.showRealme();
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}