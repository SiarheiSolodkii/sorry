package PACKAGE_NAME;
import java.io.IOException;
import java.util.Scanner;
public class Sorry {

        public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);
            int numberStrangers=scanner.nextInt();

            if(numberStrangers>0){

                String[] names=new String[numberStrangers];
                for (int i=0; i< numberStrangers;i++){
                    System.out.println("input name");
                    names[i]=scanner.nextLine();
                }
                for (int i=0; i< numberStrangers;i++){
                    System.out.println("Hello, " + names[i]);
                }
            }
            else if(numberStrangers==0) System.out.println("Oh, it looks like there is no one here");
            else System.out.println("Seriously? Why so negative?");
        }

    }


