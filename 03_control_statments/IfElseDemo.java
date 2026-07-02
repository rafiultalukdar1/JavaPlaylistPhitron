public class IfElseDemo {
    public static void main(String[] args) {


        int num = 13;
        if ((num % 2) == 0) {
            System.out.println("even");
        } else {
            System.out.println("Odd");
        }
        

        int mark = 91;

        if (mark >= 90) {
            System.out.println("A");
        } 
        else if (mark >= 80) {
            System.out.println("A-");
        } 
        else if (mark >= 70) {
            System.out.println("B");
        } 
        else if (mark >= 60) {
            System.out.println("C");
        } 
        else if (mark >= 50) {
            System.out.println("D");
        } 
        else if (mark >= 40) {
            System.out.println("E");
        } 
        else {
            System.out.println("F");
        }




    }
}