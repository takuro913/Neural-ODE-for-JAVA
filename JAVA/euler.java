public class euler{
    public static double  func_generate(double x){//微分したい関数の定義
        return Math.pow(x,3)-2*Math.pow(x,2)+1;
    }
    public static void dxdt(){//導関数を求める
        double h=0.001;//刻み幅
        //ここから導関数を求めるコードを書く

    }
    public static void euler_method(){
        //導関数をもとにオイラー法で数値解析
    }
    public static void main (String[] args){
        // euler_method()
        System.out.println(func_generate(5));
    }
}