import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
         boolean run = true;

        while(run){
            System.out.print("Enter the number in the Fibonacci sequence you want to see (or type 'quit' to exit): ");

            if(scanner.hasNextInt()){
                int n = scanner.nextInt();

                if(n >= 0){
                    System.out.println(fibonacci(n));
                }

                else{
                    System.out.println("Enter a non-negative number");
                }
            }

            else{
                String key = scanner.nextLine();

                if(key.equalsIgnoreCase("quit")){
                    run = false;
                }

                else{
                    System.out.println("Invalid input you must enter 'quit' or a number");
                }
            }


            

            if(scanner.nextLine().equals("quit")){
                run = false;
            }

        }

        scanner.close();



    }

    private static long fibonacci(int n){
       if(n <= 1){
        return n;
       }
       
       
       long num1 = 0;
       long num2 = 1;
       long newNum = 0;
       
        for(int i = 2; i <= n; i++){
        newNum = num1 + num2;

        num1 = num2;
        num2 = newNum;

       }

       return newNum;

        }

    }

   