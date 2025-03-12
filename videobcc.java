import java.util.Scanner;

public class videobcc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int k = input.nextInt();
            
            int result = 0;
            int inidia = 0;
        
                while (result!=n) {
                    for (int j = 1; j <= k; j++){

                    if(result==n){
                        break;
                    }

                    if (j==1) {
                        result += 1; 
                    }
                    
                    if (j!=k){
                        result += 0;
                    }
                    inidia += 1;
                }
            }
        
        System.out.println(inidia);
        }
    }   
}
