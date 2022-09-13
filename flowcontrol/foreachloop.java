package flowcontrol;

public class foreachloop {

    public static void main(String[] args) {

        int a[]= {10,20,30,40,50,60,70,80};



        for(int i =0 ;i<a.length;i++){
           System.out.print(a[i]+" ");
        }

        System.out.println();
        System.out.println("For Each Loop - Automatically take one by one");
         for(int a1:a){
          System.out.print(a1+" ");
        }

         char[] character_array={'A','d','f','l','m','p'};

         for(char c:character_array){
             System.out.print(c+" ");

         }

         String[] names = {"Dhamodharan","Pooja","Doshi"};
         for (String s:names){
             System.out.print(s+" ");
         }



        for(int i =0 ;i<a.length;i++){
            if(i==2)
            System.out.print(a[i]+" ");
        }



    }
}
