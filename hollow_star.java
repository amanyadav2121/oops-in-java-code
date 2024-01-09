public class hollow_star{
    public static void main(String args[]) {
        int n=5;
        int m=5;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=m;j++){
                //cell_(i,j)
                if(i == 1  || j == 1 ||  j==2 ||  j==4 ||  i == n || j == m){
                    System.out.print("* "+"\t");
                }
                else{
                    System.out.print("  "+"\t");
                }
                if((i,j)==(3,2)){
                    System.out.print("t");
                }
            }
            System.out.println();
        }
    }
    }
    

