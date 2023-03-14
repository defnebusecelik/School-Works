class ThirdQuestion {
    //defnebuseçelik
    public static void main(String[] args) {
        int[][] array= {{1,3,2}, {1,4,5}, {3,4,2}};
        System.out.print("Yeni Dizi: { ");
        diziTersten(array);
        System.out.print(" }");
    }
    public static void diziTersten(int[][] array){
         for(int i=(array.length)-1; i>=0 ;i--){
             System.out.print("{ ");
             for(int j=(array[i].length)-1; j>=0; j--){
                if(j>0)
                    System.out.print(array[i][j]+", ");
                else
                    System.out.print(array[i][j]);}
             if(i>0)
                System.out.print("}, ");
            else
                System.out.print(" }");}
    }
}
