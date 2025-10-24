
public class matrix{
    public static void matrix_product(){
         int[][] A={
            {2,3},
            {5,6},
            {10,82}
            
        };
        int[][] B={
            {7,9,3},
            {4,1,4}
        };

        int m=A.length;//Aの行長さ
        int n=B.length;//Bの行長さ
        int o=B[0].length;//Bの列長さ
        int[][] C=new int[m][o];
        for (int i=0; i<m; i++){//Aの行操作
            for (int j=0; j<o; j++){//Bの列操作
                for (int k=0; k<n; k++){//行列かけ算繰り返し
                    C[i][j]+=(A[i][k]*B[k][j]);
                }
                System.out.print(C[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
       matrix_product();
    }    
}