package JavaPrograms;

public class TransposeMatrix {
    static int N = 4;

    static void transpose(int A[][],int B[][]){
    int i,j;
        for(i=0;i<N;i++)
            for(j=0;j<N;j++)
                B[i][j] = A[j][i];
    }

    public static void main(String[] args) {
        int A[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int B[][] = new int[N][N] , i,j;
        transpose(A,B);
        System.out.println("Transpose of Square Matrix : ");
        for(i=0;i<N;i++){
            for(j=0;j<N;j++)
                System.out.print(B[i][j] + " ");
            System.out.println("\n");
        }
    }
}
