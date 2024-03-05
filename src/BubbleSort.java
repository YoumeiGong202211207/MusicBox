public class BubbleSort{
    //array = {38,65,3,17,2}
     public void bubbleSort (int [] array) {
         for(int i=0; i<array.length-1;i++){
             for (int j = 0;j<array.length-i-1;j++){
 if (array[j] > array [j+1]){
     //65<3;{2,3,17,38,65}
     System.out.println("i value is"+i+" and j value is "+j);
     int temp =array [j];
     array [j]=array[j+1];
     array[j+1]=temp;
 }
             }
         }
         for(int j=0; j<array.length;j++){
             System.out.println(array[j] + ",");
         }
     }
 }