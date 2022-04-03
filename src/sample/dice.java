package sample;
import java.util.Random;
import java.util.*;

    public class dice {
        static int i = 0,count = 0;
        static int PlayerCount = 0;
        public static int getNumber(){
        i ++;count ++;
        int num1;
        int n = (int)(Math.random()*6 + 1);
        if(count % 2 ==0) {
            if(ioio.player == 4)
            PlayerCount++;
           if(ioio.player == 3){
               if (PlayerCount % 4 == 1) PlayerCount++;
               if (PlayerCount % 4 == 2 ) PlayerCount++;
               if (PlayerCount % 4 == 3 ) PlayerCount++;
               if (PlayerCount % 4 == 0 ) PlayerCount += 2;
           }
           if(ioio.player == 2){
               if (PlayerCount % 4 == 1) PlayerCount++;
               if (PlayerCount % 4 == 2 ) PlayerCount++;
               if (PlayerCount % 4 == 3 ) PlayerCount += 2;
               if (PlayerCount % 4 == 0 ) PlayerCount += 2;
           }
                if (PlayerCount % 4 == 1 && Yellow.winNumber == 4) PlayerCount++;
                if (PlayerCount % 4 == 2 && Red.winNumber == 4) PlayerCount++;
                if (PlayerCount % 4 == 3 && Green.winNumber == 4) PlayerCount++;
                if (PlayerCount % 4 == 0 && Blue.winNumber == 4) PlayerCount++;

        }

        if(i > 2){
             num1 = i % 2;
        }
        else  num1 = i;
        description.setDescription(String.format("The %s dice number is %d\n",(num1 == 1)?"first":"second",n));
        return n;
    }
    public static int dice2(){
            int n = (int)(Math.random()*6 + 1);
            return n;
    }
//此方法不与Dice类有关
    public static ArrayList getPace(int num3,int num4) {

        Random random = new Random();
        int num1 = num3;
        int num2 = num4;
        int jia = num1 + num2;
        int jian = Math.abs(num1 - num2);
        int cheng = num1 * num2;
        int chu = 1;
        if (num1 % num2 != 0 && num2 % num1 != 0) {
            chu = 0;
        }
        else if (num1 >= num2) {
            chu = num1 / num2;
        }
        else {
            chu = num2 / num1;
        }
        int arr[] = new int[6];
        arr[0] = num1;
        arr[1] = num2;
        arr[2] = jia;
        arr[3] = jian;
        arr[4] = cheng;
        arr[5] = chu;
        ArrayList list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i]) && arr[i] != 0 && arr[i] <= 12) {
                list.add(arr[i]);
            }
        }

       return list;
    }
        public static ArrayList getPace1(int num3,int num4) {
            Random random = new Random();
            int num1 = num3;
            int num2 = num4;
            int jia = num1 + num2;
            int jian = Math.abs(num1 - num2);
            int cheng = num1 * num2;
            int chu = 1;
            if (num1 % num2 != 0 && num2 % num1 != 0) {
                chu = 0;
            }
            else if (num1 >= num2) {
                chu = num1 / num2;
            }
            else {
                chu = num2 / num1;
            }
            int arr[] = new int[6];
            arr[0] = num1;
            arr[1] = num2;
            arr[2] = jia;
            arr[3] = jian;
            arr[4] = cheng;
            arr[5] = chu;
            ArrayList list = new ArrayList();
            for (int i = 0; i < arr.length; i++) {
                if (!list.contains(arr[i])  && arr[i] != 0 && arr[i] <= 12) {
                    list.add(arr[i]);
                }
            }

            return list;
        }
    }

