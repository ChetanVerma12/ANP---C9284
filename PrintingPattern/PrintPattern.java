package ANP;

public class PrintPattern {
    
    public static void PrintingPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        PrintingPattern(n);
    }
    
}
