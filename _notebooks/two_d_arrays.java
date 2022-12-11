package _notebooks;



public class two_d_arrays{
    public static int[][] numbers = {{70,32,23,42},{93,76,89,0}, {12,15,61,80},{23,76,34,55}};
    
    
    public static int[][] reverse(){
        int[][] reverse_arr = new int[4][4];
        for(int i =0; i < numbers.length; i++)
        {
                for (int j=0; j<numbers[i].length; j++){
                reverse_arr[i][numbers[i].length - 1 - j] = numbers[i][j];
            }
        }
        System.out.println(reverse_arr);
        return reverse_arr;
    }


    public static void main(String[] args){
        two_d_arrays.reverse();
    }


}


