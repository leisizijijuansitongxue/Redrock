import java.util.Scanner;

public class level3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() ;
        int[][] arr1 = new int [n][n];
        int[][] arr2 = new int [n][n];
        int[][] result = new int [n][n];
        //初始化矩阵
        for (int i = 0 ; i < n ; i ++){
            for (int j =0 ; j <= i ; j ++){
                arr1[i][j] = arr1[j][i] = (int) (Math.random() * 100);
                arr2[i][j] = arr2[j][i] = (int) (Math.random() * 100);
            }
        }

        //输出矩阵1
        System.out.println("输出矩阵1");
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j ++){
                System.out.print(arr1[i][j]+"\t\t");
            }
            System.out.println();
        }

        System.out.println("\n\n\n");

         //输出矩阵2
         System.out.println("输出矩阵2");
         for (int i = 0 ; i < n ; i++){
             for (int j = 0 ; j < n ; j ++){
                 System.out.print(arr2[i][j]+"\t\t");
             }
             System.out.println();
         }

         //矩阵相乘

         for (int i = 0 ; i < n ; i ++){//第1个矩阵的行
            for (int m = 0 ; m < n ; m++){//第2个矩阵的行
                for (int j = 0 ; j < n ; j ++){//第1个矩阵的列
                    for (int y = 0 ; y < n ; y ++){//第2个矩阵的列
                        result[i][m] += arr1[i][j] * arr2[y][m];
                    }
                }
            }
        }

        System.out.println("\n\n\n");

         //打印矩阵结果
        System.out.println("新的矩阵为：");
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.print(result[i][j]+"\t\t");
            }
            System.out.println();
        }

        System.out.println("\n\n\n");
        System.out.println("相乘后对角线和为：");
        int r = 0;
        for (int i = 0 ; i < n ; i ++ ){
            r += result[i][i];
        }
        System.out.println(r);
    }
}
//arr1[i][j] * arr2[]