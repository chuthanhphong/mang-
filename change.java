import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

public class change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 5 ;
        do {
            System.out.println("Menu");
        System.out.println("1 : Chuyển từ C sang F");
        System.out.println("2 : Chuyển từ F sang C");
        System.out.println("3 : Exit");
            System.out.println("Nhập lựa chọn");
            choice =sc.nextInt();
          switch (choice){
              case 1:
                  System.out.println("nhập độ c");
                  double c = sc.nextDouble();
                  double f;
                  f =  (9.0 / 5) * c + 32;
                  System.out.println(f);
                  break;
              case 2:
                  System.out.println("nhập độ F");
                  double f1 = sc.nextDouble();
                  double c1 ;
                  c1 = (5.0 / 9) * (f1 - 32);
                  System.out.println(c1);
                  break;
              case 3:
                  System.exit(0);
              default:
                  System.out.println("Not choice");
          }
    }while (choice!=0);
}}
