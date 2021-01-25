import javax.swing.text.html.parser.Parser;
import java.sql.Array;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner sc =new Scanner(System.in);

        int a=sc.nextInt();

        int []val=new int[a];

        for(int i=0;i<a;i++){
            String c=sc.next();
            val[i]= Integer.parseInt(c);
        }
       test(val);
        System.out.println("Tuc");

    }
    public static void test(int arr[]){

        HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();

        int n= arr.length;
        for(int i=0;i<n;i++){
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            }else{
                hashMap.put(arr[i],1);
            }
        }
        for(int c:hashMap.keySet()){
            if(hashMap.get(c)/2>=1){
                System.out.println( "Pentru key "+c+" Valoare este "+hashMap.get(c)/2);
            }

        }


    }
}
