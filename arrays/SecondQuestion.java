class SecondQuestion {
    //defne buse çelik
    public static void main(String[] args) {
        int[] arrayT= {1,5,8,3,27};
        System.out.print("Yeni Dizi: ");
       diziTersten(arrayT);
    }
    //istenen döngüsel fonksiyon
    public static void diziTersten(int[] arrayT){
         for(int i=(arrayT.length)-1; i>=0 ;i--){
            System.out.print(arrayT[i]+" ");
        }
    }
}
