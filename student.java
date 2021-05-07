import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        String [] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter your name ");
        Scanner inputname = new Scanner(System.in);
        boolean result = false;
        String name = inputname.nextLine();
            for(int i =0;i<student.length;i++){
                if(name.equals(student[i])){
                    System.out.println("Position your name of the list " + name + " is " + (i+1));
                    result = true;
                    break;

                }
        }   if(!result){
            System.out.println("Not found");
        }
    }
}
