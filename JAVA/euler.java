public class euler{
    public static double  func_generate(double x){//微分したい関数の定義
        return Math.pow(x,3)-2*Math.pow(x,2)+1;
    }
    public static double dxdt(double x){//導関数を求める
        double h=0.001;//刻み幅
        double dxdt=((Math.pow(x+h,3)-2*Math.pow(x+h,2)+1)-(Math.pow(x,3)-2*Math.pow(x,2)+1))/h;
        return dxdt;

    }
    public static void euler_method(){
        //導関数をもとにオイラー法で数値解析
    }
    public static void main (String[] args){
        // euler_method()
        int x=10;//定義域の範囲
        double[][] data=new double [x][2];
        for (int i=0;i<x;i++){
            for (int j=0;j<2;j++){
                if (j==0){
                    data[i][j]=i+1;
                }
                else if (j==1){
                    data[i][j]=func_generate(i+1);
                }
                System.out.print(data[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
}