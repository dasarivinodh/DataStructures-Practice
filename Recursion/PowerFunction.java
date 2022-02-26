public class PowerFunction {
    public static void main(String args[]) {
      int x=2;
      int y=4;
      PowerFunction m=new PowerFunction();
      int z=m.powerfunction(x,y);
    
      System.out.println(x+ " power "+y+" : " + z);
    }
    
    int powerfunction(int x, int y){
        
        if(y==0){
         return 1;
        }
        return x*powerfunction(x,y-1);
    }
}
