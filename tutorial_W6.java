public class tutorial_W6{

 public static void main (String [] N){
     
     int[] age;  //declaring
     age= new int[5]; //construction
     
     System.out.println(age.length);    //finding length of an array
     
     //firstIndex=0 , lastIndex= age.length-1=5 -1 =4;
     
     age[0]=10;
     age[1]=20;
     age[2]=30;
     age[3]=40;
     age[4]=50;
     
     int[] ages = {5,10,15,20,25};   //all in one
     
     System.out.println(ages.length);   //5
     
     System.out.println(ages[0]);
     
     for(int i=0; i< ages.length; i++)
     {
         System.out.println(ages[i]);
     }
     
     int [] ages1 = {25,20,15,10,5};
     System.out.println(ages1.length);
     System.out.println(ages1[0]);
     
     for(int i=5; i>ages.length; i--)
     {
         System.out.println(ages1[i]);
     }
     
     
     
     
 }
    
    
    
    
}