
package codingbat_2; // dizinin ilk ve son elemanlarından hangisi büyükse onu diziye bastıran metot

import java.util.Arrays;
import java.util.Random;


public class CodingBat_2 {
    
public static int [] Dizi(){
    Random rn = new Random();
    int []dizi = new int[5];
    for(int i=0; i<dizi.length;i++){
        dizi[i] = rn.nextInt(10)+1;
      
    }
    
    return dizi;
}

public static int[] maxEnd3(int []dizi){
    if(dizi[0]<dizi[dizi.length-1]){
        for(int i=0;i<dizi.length;i++){
            dizi[i]=dizi[dizi.length-1];
            //return dizi;
        }
    }else{
         for(int i=0;i<dizi.length;i++){
            dizi[i]=dizi[0];
            //return dizi;
        }
    }
    return dizi;
}
    
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(maxEnd3(Dizi())));
    }
    
}
