import java.util.Scanner;


public class level2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {346,3242,6765,234,214,8768,325,3902,123359};
        System.out.println("未进行排序为：");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        //冒泡排序
        for (int i = 0 ; i < arr.length - 1 ; i ++){
            for (int  j = 0 ; j < arr.length - i - 1  ; j++){
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j+1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("进行冒泡排序后为：");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        //选择排序
        for (int i = 0 ; i < arr.length - 1 ; i++){
            int a = i;
            for (int j = i  ; j < arr.length ; j++){
                if (arr[j] < arr[a]){
                    a = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[a];
            arr[a] = temp;
        }
            System.out.println("进行选择排序后为");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        //插入数字
        System.out.println("请输入你想要插入的数字：");
        int add = in.nextInt();
        int[] addarr = new int[arr.length + 1];

        byte flag = 0 ;
            if (add <= arr[0]){
                addarr[0] = add;
                for (int i = addarr.length - 1 ; i > 0 ; i--){
                    addarr[i] = arr[i - 1];
                }
                flag = 1;
            }
            if (add >= arr[arr.length - 1]){
                addarr[addarr.length - 1] = add;
                for (int i = 0 ; i < addarr.length - 1 ; i ++){
                    addarr[i] = arr[i];
                }
                flag = 1;
            }
            byte bool = 0;
            if (flag == 0){
                for (int i = 0 ; i < addarr.length ; i ++ ){
                    if (arr[i] <= add && add <= arr[i + 1] && bool == 0){
                        addarr[i + 1] = add;
                        bool ++;
                    }
                    if (bool == 0){
                        addarr[i] = arr[i];
                    }
                    if (bool == 1){
                        addarr[i + 1] = arr[i];
                    }
                }
            }

        System.out.println("插入数字 "+ add +" 后的数组为：");
        for (int i = 0 ; i < addarr.length ; i++){
            System.out.print(addarr[i] + "  ");
        }
        System.out.println();
    }
}



