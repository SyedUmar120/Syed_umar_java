import java.util.*;
public class symmetricmatrix {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        boolean issymmetric=true;
        for(int i=0;i>row;i++){
        for(int j=0;j<col;j++){
            if(arr[i][j]!=arr[j][i]){
                issymmetric=false;
                break;
            }
            }
        }
        if(issymmetric){
            System.out.println("matrix is symmetric");
        }else{
            System.out.println("matrix is not symmetric");
        }
    }
}

    
        