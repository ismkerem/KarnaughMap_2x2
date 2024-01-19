import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static int[] location_maxterm = new int[4];
    private static String result="";
    public static void main(String[] args) {


        System.out.println(" 2x2 Karnaugh Map Solver Welcome !!!");
        System.out.println("Enter of maxterm.Please enter number which number is between 0 and 3 ");
        enter_maxterm();

        System.out.println("Karnaugh map : "+result(result));
    }




    public static String result(String result){
        if(location_maxterm[0]==location_maxterm[1] && location_maxterm[2]==location_maxterm[3] && location_maxterm[2]==1 && location_maxterm[0]==1){
            return "1";
        }
        else if((location_maxterm[0]==location_maxterm[1] || location_maxterm[0]==location_maxterm[2]) &&  location_maxterm[0]==1) {
            if (location_maxterm[0]==1){
                result+= "+B'";
            }
            if (location_maxterm[2]==1){
                result+="+A'";
            }

        }
        else if((location_maxterm[3]==location_maxterm[1] || location_maxterm[3]==location_maxterm[2]) && location_maxterm[3]==1){
            if (location_maxterm[1]==1){
                result+= "+A";
            }
            if (location_maxterm[2]==1){
                result+="+B";
            }
        }
        else {
            if (location_maxterm[0]==1){
                result+="+A'B'";
            }
            if (location_maxterm[1]==1){
                result+= "+AB'";
            }
            if (location_maxterm[2]==1){
                result+="+A'B";
            }
            if (location_maxterm[0]==1) {
                result += "+AB";
            }
        }
        return result.substring(1);
    }
    public  static  void enter_maxterm(){
        Scanner maxterm = new Scanner(System.in);
        int temp;
        for (int i=0;i<4;i++){
            temp=maxterm.nextInt();
            if(temp>=0){
                location_maxterm[temp]=1;
            }
            else{
                break;
            }
        }
    }

}