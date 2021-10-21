import java.util.Scanner;

//自定义数组工具

class Arraytools  {

    //增加数组长度
    public Object[] plus(Object[] arr ) {
        Object[] elements = new Object[arr.length + 1] ;
        for (int i =0 ; i < arr.length ; i ++){
            elements[i] = arr[i];
        }
        return elements;
    }

    //减少数组长度
    public Object[] reduce(Object[] arr ) {
        Object[] elements = new Object[arr.length - 1] ;
        for (int i =0 ; i < arr.length - 1 ; i ++){
            elements[i] = arr[i];
        }
        return elements;
    }

}

class ArrayList {
    Arraytools list1 = new Arraytools();
    private Object[] arr = new Object[0];//声明数组
    private int size = 0;

    //选定目标地址，并储存元素
    public Object[] add(int index, Object add) {
        for (int i = 0 ; i <= index ; i ++){
            this.arr = list1.plus(this.arr);
            this.size++;
        }
        this.arr[index] = add;//找到储存的地址，并将值赋给该地址
        return arr;
    }

    //选定目标地址，并返回该地址储存的值
    public Object get(int index) {
        Object s ;
        if (this.arr[index] == null || index > arr.length){
                s = null;
        }else{
             s = this.arr[index];
        }
        return s;
    }

    //选定目标地址，并删除该地址储存的值
    public Object remove(int index) {
        if (this.arr[index] != null){ //判断目标地址是否为空
            this.arr[index] = this.arr[this.size - 1];//对结果进行判断，如果地址对应的元素与要删除
            this.arr = list1.reduce(this.arr);        //的元素相同，则将末尾元素赋给该地址，然后将数组长度减1
        }
        return arr;
    }

    //删除特定的数据
    public Object remove(Object obj){
        //如果数组没有元素，则直接返回数组本身
        //如果数组中有元素，则将数组遍历
        if (arr.length != 0){
            int add = 0;//标识符，用于找到与要删除的元素的地址
            while (obj != this.arr[add] && add <= this.size - 1){//进行遍历
                add ++ ;
            }
            if (obj == this.arr[add]){                      //防止在数组的最后一位，对结果进行判断，如果地址对应的元素与要删除
                this.arr[add] = this.arr[this.size - 1] ;   //的元素相同，则将末尾元素赋给该地址，然后将数组长度减1
                this.arr = list1.reduce(this.arr);
                this.size = this.size --;
            }
        }
        return arr;
    }

    public Object[] add(Object obj) {
        int flag = 0;//创建标识
        for (int i = 0 ; i < this.size ; i ++){
            if (this.arr[i] == null){
                this.arr[i] = obj;
                flag = 1; //数组有空位，将要添加的值加入数组的空位中
            }
        }
        if (flag == 0){//如果数组没有空位，将数组长度增加1，把值添加到末尾
            arr = list1.plus(arr);
            this.size = this.size ++;
            arr[this.size - 1] = obj;
        }
        return arr;
    }

    public int getSize(Object[] arr){//获取arr数组的数据个数
        return arr.length;
    }
}

public class level5 {
    public static void main(String[] args) {
//        Object[] a = new Object[10];
        Scanner in = new Scanner(System.in);
        ArrayList list1 = new ArrayList();
        Arraytools list2 = new Arraytools();
        list1.add(1 , "红岩网校yyds");
        System.out.println(list1.get(1));
     }
}
