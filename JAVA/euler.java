public class euler{
    public static double  func_generate(double x){//微分したい関数の定義
        return Math.pow(x,3)-2*Math.pow(x,2)+1;
    }
    public static double dxdt(double x,double h){//導関数を求める
        double dxdt=((Math.pow(x+h,3)-2*Math.pow(x+h,2)+1)-(Math.pow(x,3)-2*Math.pow(x,2)+1))/h;
        return dxdt;

    }
    public static void euler_method(int x,double h){
        //導関数をもとにオイラー法で数値解析
        double loop_num=(1/h)*x;//実行回数。刻み幅の逆数×定義域
        int steps=(int)loop_num;// 繰り返し回数を整数に
        double y_0=func_generate(0);//初期値
        double[][] euler_data=new double [steps+1][2];//main関数のx=10の場合,定義域は0～10のつもりなので行数はプラス1個多めに必要
        for (int i=0;i<=steps;i++){
            for (int j=0;j<2;j++){
                if (j==0){
                    euler_data[i][j]=i*h;
                }
                else if (j==1){
                    y_0+=dxdt(i,h)*h;
                    euler_data[i][j]=y_0;
                }
                 System.out.print(euler_data[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main (String[] args){
        // euler_method()
        double h=0.001;//刻み幅
        int x=10;//定義域の範囲
        euler_method(x,h);

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