
import java.util.Scanner; 
class GradeFinder{
	public static void main(String[] args){
	Scanner getresult = new Scanner(System.in);
        System.out.print("Please Enter Your Result: ");
        int result;
        result = getresult.nextInt();
        while((result < 0) || (result > 100)){
        System.out.print("Please enter marks between 0 and 100: ");
        result = getresult.nextInt();
      
        }
        int grade = (result/10);
        switch(grade){
            case 10:
            case 9:
            case 8:
            case 7:
                System.out.println("Your grade is A ");
                break;
            case 6:
                System.out.println("Your grade is B ");
                break;
            case 5:
                System.out.println("Your grade is C ");
                break;
            case 4:
                System.out.println("Your grade is D ");
                break;
            default:
                System.out.println("Your grade is F ");
        }
	}
}