public pyramid{
  public static void main(String[] args){
     int x;
     int num=5;
     //inner ith row printing
     for( int i=1;i<=num;i++){
         x=i-1;

         for(int j=1;j<=num-1;j++){
             System.out.print(" ");
             System.out.print(" ");

         }
         //for pyramid printing
         for(int j=0;j<=x;j++)
             System.out.print((i + j) + " ");

         System.out.println();
     }

    }
}
