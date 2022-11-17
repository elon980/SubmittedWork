public class ex7 {
    public static void main(String[] args){
        int unity,dozens,hunders;
        for (int i=1;i<1000;i++){
            int count=1;
            unity=i%10;
            dozens=(i/10)%10;
            hunders=i/100;
            if(dozens>=0)
                count++;
            if(hunders!=0)
                count++;
            if(count==1)
                System.out.print(i+",");
            if (count==2) {
                if ((unity * unity) + (dozens * dozens) == i)
                    System.out.print(i + ",");
            }
            if(count==3){
                if ((unity * unity*unity) + (dozens * dozens*dozens) + (hunders*hunders*hunders) == i)
                    System.out.print(i + ",");
            }

        }
    }
}
