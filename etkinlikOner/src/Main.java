import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int heat;
      Scanner inp=new Scanner(System.in);
        System.out.print("Sıcaklık giriniz: ");
        heat=inp.nextInt();
        if(heat<5){
            System.out.println("Kayak yapabilirsiniz!");
        }
         else if(5 <=heat && heat <15){
            System.out.println("Sinemaya gidebilirsiniz!");

        }
         else if (15<=heat && heat <25){
            System.out.println("Piknik yapabilirsiniz!");
        }
        else if(25<=heat){
            System.out.println("Yüzmeye gidebilirsiniz!");
        }
       /* switch (heat) {
            case 0:
                if (heat < 5) {
                    System.out.println("Kayak yapmayı öneriyoruz.");
                } else {
                    System.out.println("Sinema etkinliğini öneriyoruz.");
                }
                break;
            case 1:
                if (heat < 15) {
                    System.out.println("Sinema etkinliğini öneriyoruz.");
                } else {
                    System.out.println("Piknik yapmayı öneriyoruz.");
                }
                break;
            case 2:
                if (heat < 25) {
                    System.out.println("Piknik yapmayı öneriyoruz.");
                } else {
                    System.out.println("Yüzme etkinliğini öneriyoruz.");
                }
                break;
            default:
                System.out.println("Yüzme etkinliğini öneriyoruz.");
                break;
        } */
    }
}