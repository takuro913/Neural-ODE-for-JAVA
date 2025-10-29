public class  euler_universal{
    interface ODEFunc{
        double func(double x,double t);
    }
    class euler_solver{
        public static double solve(ODEFunc f,double x0,double t0,double t1,double h){
            double x=x0;
            for (double t = t0;t<t1+1;t+=h){
                x=x+h*f.func(x,t);
                System.out.println(t+"回目"+x);
            }
            return x;
        }
    }
    
    public static void main(String[] args){
        ODEFunc myFunc=(x,_)->(Math.pow(x, 3) - 2*Math.pow(x, 2) + 1);

        double result=euler_solver.solve(myFunc,0.0,0.0,5.0,0.1);
        System.out.println("x(2.0)="+result);
        //各xに対する値が全然予測できてない
    
    }

    
    
} 