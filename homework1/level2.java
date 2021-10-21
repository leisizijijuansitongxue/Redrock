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
        for (int i = 0 ; i < arr.length ; i ++){
            addarr[i] = arr[i];
        }
        addarr[arr.length ] = add;

        for (int i = 0 ; i < arr.length ; i ++){
            if (arr[i] <= add && arr[i + 1] >= add ){
                
            }
        }

//        //冒泡排序
//        for (int i = 0 ; i < addarr.length - 1 ; i ++){
//            for (int  j = 0 ; j < addarr.length - i - 1  ; j++){
//                if(addarr[j] < addarr[j + 1]){
//                    int temp = addarr[j+1];
//                    addarr[j + 1] = addarr[j];
//                    addarr[j] = temp;
//                }
//            }
//        }
//        System.out.println("进行冒泡排序后为：");
//        for (int i = 0 ; i < addarr.length ; i++){
//            System.out.print(addarr[i] + "  ");
//        }
//        System.out.println();
//
//        //选择排序
//        for (int i = 0 ; i < addarr.length - 1 ; i++){
//            int a = i;
//            for (int j = i  ; j < addarr.length ; j++){
//                if (addarr[j] < addarr[a]){
//                    a = j;
//                }
//            }
//            int temp = addarr[i];
//            addarr[i] = addarr[a];
//            addarr[a] = temp;
//        }
//        System.out.println("进行选择排序后为");
//        for (int i = 0 ; i < addarr.length ; i++){
//            System.out.print(addarr[i] + "  ");
//        }
        System.out.println();
    }
}



