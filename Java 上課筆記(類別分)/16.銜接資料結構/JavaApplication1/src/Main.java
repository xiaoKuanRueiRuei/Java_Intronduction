
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //List串列的使用
        //is a container-->裝東西用的
        //可以在任意位置插入資料
        //ArrayList 陣列法-->適合資料異動少但查詢多的情況下使用
        //LinkedList 指標(參考、鏈結)法-->適合異動頻繁查詢少的情況下使用
        //add
        //removed
        List<Integer> a = new ArrayList<>(Arrays.asList(8, 2, 7, 0, 6));
        //List<Integer>a= new LinkedList<>(Arrays.asList(8,2,7,0,6));-->鏈結法
        System.out.println(a);
        /*
         [8, 2, 7, 0, 6]
         */
        a.add(1, 3);
        //在第一個位置插入3(資料)
        System.out.println(a);
        /*
         [8, 3, 2, 7, 0, 6]
         */
        a.add(a.indexOf(7), -1);
        //找出7(資料)，並且在7前面加入-1
        System.out.println(a);
        /*
         [8, 3, 2, -1, 7, 0, 6]
         */
        a.remove(3);
        //位置3(第四個數字)
        System.out.println(a);
        /*
         [8, 3, 2, 7, 0, 6]
         */
        a.remove(Integer.valueOf(3));
        //如果直接寫3，系統會判定為Integer(類別)
        //所以要轉回整數
        System.out.println(a);
        /*
         [8, 2, 7, 0, 6]
         */

        //Stack 堆疊 : last-in(LIFO)principle(後進先出 or 先進後出)
        //副程式的呼叫，最後呼叫的會最先返回(就是堆疊的概念)
        //線性資料結構-->有嚴格位置規定(尾取尾加)
        //puch : 加入
        //pop  : 取出
        //串列中罕見嚴格限制不能插隊(只能在最後面處理)
        int[] data = {1, 2, 3, 4, 5};
        Stack<Integer> b = new Stack<>();

        for (int x : data) {
            b.push(x);
            //把資料加進去
        }
        System.out.println("Stack : " + b);
        /*
         Stack : [1, 2, 3, 4, 5]
         */

        b.push(6);
        System.out.println("Stack : " + b);
        /*
         Stack : [1, 2, 3, 4, 5, 6]
         */
        b.push(7);
        System.out.println("Stack : " + b);
        /*
         Stack : [1, 2, 3, 4, 5, 6, 7]
         */
        int x = b.pop();
        //pop取出資料(只能拿出最後面的)
        //int x 是為了可以知道移除的資料是什麼
        System.out.println("Stack : " + b);
        System.out.println("Stack : " + x);
        /*
         Stack : [1, 2, 3, 4, 5, 6]
         Stack : 7
         */
        b.pop();
        //直接移除，不能知道移除的資料是什麼
        System.out.println("Stack : " + b);
        /*
         Stack : [1, 2, 3, 4, 5]
         */

        //Queues 柱列(排隊的感覺) : first-in first-out(FIFO) principle先進先出法
        //線性資料結構-->有嚴格位置規定(頭取尾加)
        //enqueue:add(store) an item to the queue
        //dequeue:remove(access) an item from the queue
        int[] dataqueue = {1, 2, 3, 4, 5};
        Deque<Integer> c = new ArrayDeque<>();
        for (int y : dataqueue) {
            c.add(y);
        }
        System.out.println("Queue : " + c);
        /*
         Queue : [1, 2, 3, 4, 5]
         */

        c.addFirst(6);
        System.out.println("Queue : " + c);
        /*
         Queue : [6, 1, 2, 3, 4, 5]
         */
        c.addLast(7);
        System.out.println("Queue : " + c);
        /*
         Queue : [6, 1, 2, 3, 4, 5, 7]
         */
        int x1 = c.removeFirst();
        System.out.println("Queue : " + c);
        System.out.println("Queue : " + x1);
        /*
         Queue : [1, 2, 3, 4, 5, 7]
         Queue : 6
         */
        c.removeLast();
        System.out.println("Queue : " + c);
        /*
         Queue : [1, 2, 3, 4, 5]
         */
    }
}
