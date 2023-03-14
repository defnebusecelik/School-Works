class SecondQuestion {
    //defnebuseçelik
    public static void main(String[] args) {
        int[] arrayT= {1,5,8,3,27};
        System.out.print("Yeni Dizi: { ");
        diziTersten(arrayT);
        System.out.print("}");
    }
    public static void diziTersten(int[] arrayT){
         for(int i=(arrayT.length)-1; i>=0 ;i--){
             if(i>0)
                System.out.print(arrayT[i]+", ");
            else
                System.out.print(arrayT[i]);
        }
    }
}
