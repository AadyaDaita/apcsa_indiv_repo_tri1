package _notebooks;
import java.util.ArrayList;
 
class arraylist {
    public ArrayList<String> add()
    {
        // Size
        int n = 5;

        // initial size n
        ArrayList<String> arrli = new ArrayList<String>(n);
 
        // Appending new elements at
        // the end of the list
        for (Integer i = 1; i <= n; i++){
            String string_i = i.toString();
            String shirt = "shirt ";
            shirt = shirt + string_i;
            arrli.add(shirt);
            System.out.println(arrli);
        }
        System.out.println("added all five shirts");
        return arrli;
    }


    
    public ArrayList<String> remove(){
           // Size
           int n = 5;

           // initial size n
           ArrayList<String> arrli = new ArrayList<String>(n);
           arrli = add();
    
        for (Integer i=0; i<4; i++){
            arrli.remove(0);
            System.out.println(arrli);
        }
        System.out.println("removed four shirts");
        arrli.clear();
        System.out.println(arrli);
        System.out.println("cleared any remaining shirts");
        return arrli;

    }
    

    public static void main(String[] args)
    {
        arraylist object_array = new arraylist();
        //object_array.add();
        object_array.remove();
        
    }
    
}

